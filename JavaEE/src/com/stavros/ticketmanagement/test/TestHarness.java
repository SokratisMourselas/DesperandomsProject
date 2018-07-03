// It works, only for testing, just run as java application
package com.stavros.ticketmanagement.test;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.stavros.ticketmanagement.domain.Note;
import com.stavros.ticketmanagement.domain.Ticket;
import com.stavros.ticketmanagement.domain.User;

public class TestHarness {
	

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ticketMonsterDB"); // the String here must match the name in the persistence unit tag
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		//CREATE A TICKET
//		Ticket ticket1 = new Ticket(2, "EvanEscence", "11th of july", 40, 1);
//		em.persist(ticket1); //telling the JPA that the ticket1 needs to be persistent and go into the db
		
		
		//FIND A TICKET
		Ticket existingTicket = em.find(Ticket.class, 2);	
//		System.out.println(existingTicket);
		
        //RETURN ALL NOTES FROM ONE PARTICULAR TICKET		
		Set<Note> allNotes = existingTicket.getAllNotes();
		
		for(Note next: allNotes) {
			System.out.println(next);
		}
		
		//ADD A NEW USER
		User newUser = new User(2, "filip123go", "6946576152", "Stavros489@hotmail.com", 0);
		em.persist(newUser);
//		existingTicket.addUser(1, "filip123go", "6946576152", "Stavros489@hotmail.com",  0); // this creates our one to many relationship
		
		//ADD A NEW NOTE
//		Note newNote = new Note("Change of plans, make this public on june 10st");
//		em.persist(newNote);
//		existingTicket.addNote(newNote); // this creates our one to many relationship
		
		//UPDATE A TICKET
//		Ticket ticket1 = em.find(Ticket.class, 2);
//		ticket1.setEventName("Paradox live in Athens");
		
		//REMOVE A TICKET
//		Ticket ticket1 = em.find(Ticket.class, 2);
//		em.remove(ticket1);
		
		//Create a single ticket
//		Note newNote = new Note("10% off on the last 100 tickets");		
//		em.persist(newNote);
		
		
		
		tx.commit();
		em.close();
	}

}
