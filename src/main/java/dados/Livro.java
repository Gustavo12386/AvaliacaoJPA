package dados;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livro implements Serializable {
   
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String autor;
	private String editora;
	private String qtdPaginas;
	
	public Livro()
	
	{
		
	}
	
    public Livro(Integer id, String nome, String autor, String editora, String qtdPaginas)
    
    {
		super();
		this.id = id;
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.qtdPaginas = qtdPaginas;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(String qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", nome=" + nome + ", autor=" + autor + ", editora=" + editora + ", qtdPaginas="
				+ qtdPaginas + "]";
	}
    
    
}
