package de.dks.testClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import de.dks.model.TicketModel;
import de.dks.model.User;

public class TestHarness {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ticketmonster"); // the String here must match the name in the persistence unit tag
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		TicketModel ticketModel1 = new TicketModel(6, "intestella", "Athens", "30", "1");
		User user1 = new User(1, "filip123go", "6946576152", "stavros489@hotmail.com", 30, "male");
		
		em.persist(ticketModel1);
		em.persist(user1);
		tx.commit();
		em.close();
	}
}
