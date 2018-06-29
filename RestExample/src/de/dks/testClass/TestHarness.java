package de.dks.testClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import de.dks.model.TicketModel;

public class TestHarness {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ticketmonster"); // the String here must match the name in the persistence unit tag
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		TicketModel ticketModel1 = new TicketModel(4, "Texas", "Athens", "30", "1");
		
		em.persist(ticketModel1);
		tx.commit();
		
		tx.begin();
		System.out.println(ticketModel1.toString());
		tx.commit();
		em.close();
	}
}
