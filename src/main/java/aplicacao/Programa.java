package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dados.Livro;

public class Programa {

	public static void main(String[] args) {
		Livro l1 = new Livro(null, "O Poder do Hábito", "Charles Duhigg","Objetiva","408");
		Livro l2 = new Livro(null, "Gestão da Emoção", "Augusto Cury","Saraiva","200");
		Livro l3 = new Livro(null, "O Poder do Silêncio", "Eckhart Tolle","Sextante","112");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dados-livro");
		EntityManager em = emf.createEntityManager();	
		
		em.getTransaction().begin();    
	    em.persist(l1);
	    em.persist(l2);
	    em.persist(l3);
	    em.getTransaction().commit();
	    
	    System.out.println("Cadastro com sucesso!");    
	    
	    Livro l = em.find(Livro.class, 2);
	    System.out.println(l);
	    
	    em.getTransaction().begin(); 
	    em.remove(l);    
	    System.out.println("pronto!");
	    em.getTransaction().commit();
	    
	    em.close();
	    emf.close();
	    
	    
	}

}
