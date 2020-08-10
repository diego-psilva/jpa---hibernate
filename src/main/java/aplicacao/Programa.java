package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;


public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(null, "Diego", "diegops.tads@gmail.com");
		Pessoa p2 = new Pessoa(null, "Francisco", "francisco@gmail");
		Pessoa p3 = new Pessoa(null, "Maria", "maria@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 2);
		
		System.out.println(p);
	
		System.out.println("Pronto");
		em.close();
		emf.close();


	}

}
