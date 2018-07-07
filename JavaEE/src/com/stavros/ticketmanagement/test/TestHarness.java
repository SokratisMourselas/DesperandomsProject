// It works, only for testing, just run as java application
package com.stavros.ticketmanagement.test;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.stavros.ticketmanagement.domain.Note;
import com.stavros.ticketmanagement.domain.Ticket;
import com.stavros.ticketmanagement.domain.User;

public class TestHarness {
	

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ticketMonsterDB"); // the String here must match the name in the persistence unit tag
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		//SELECT ALL THE TICKET OBJ (USER(PAGE WERE TICKETS GET SELECTED) ADMIN)
//		Query q = em.createQuery("SELECT ticket FROM Ticket ticket"); // this query says : SELECT all ticket objects from the Ticket class. the last "ticket" is the alias 
//		Query selectAllTicketsQuery = em.createNamedQuery("selectAllTickets"); // this query is stored in orm.xml
//		List<Ticket> selectAllTicketsResults = selectAllTicketsQuery.getResultList();
//		
//		//show the results of the Query q 
//		for(Ticket next : selectAllTicketsResults) {
//			System.out.println(next);
//		}
		
		//SELECT ALL THE TICKET OBJ WERE eventName = Paradox (USER(PAGE WERE TICKETS GET SELECTED) ADMIN)
//		String SearchEvent = "EvanEscence"; // here the event name from Front will return
//		int isReserved = 1; //check if is reserved
////		Query q = em.createQuery("SELECT ticket FROM Ticket ticket WHERE ticket.eventName like'" +SearchEvent+ "' AND ticket.isReserved like'" +isReserved+ "'"); // Bad practice :( this query says : SELECT all ticket objects from the Ticket class that the property eventName = "Paradox". the last "ticket" is the alias CARE SINGLE QUOTES IN 'Paradox'
////		Query q = em.createQuery("SELECT ticket FROM Ticket ticket WHERE ticket.eventName = :SearchEvent AND ticket.isReserved = :isReserved"); // correct use
//		Query q = em.createNamedQuery("searchByEventName"); // this query is stored in orm.xml
//		q.setParameter("SearchEvent", SearchEvent);
//		q.setParameter("isReserved", isReserved);
//		
//		List<Ticket> results = q.getResultList();
//		//show the results of the Query q
//		for(Ticket next : results) {
//		System.out.println(next);
//		}
//		//PRINT THE AMOUNT OF EXISTING TICKETS THAT ARE NOT RESERVED
//		System.out.println("There a total of "+results.size()+ " tickets returned"); //Works but wrong practice, waste of resources
		
		//ADD A TICKET
//		Ticket ticket1 = new Ticket(6, "Paradox", "12th of july", 40, 0);
//		em.persist(ticket1); //telling the JPA that the ticket1 needs to be persistent and go into the db
		
		//CREATE MULTIPLE NEW USERS (THIS IS FOR TESTING, THE SAME PRINCIPLE CAN BE APPLIED FOR TICKETS)
//		 for(int i=4; i<11; i++){
//			 User newUser = new User(i,"Stavros","Filippidis","6986221010", "filip123go", "46576152","stavros489@hotmail.com", 0);
//			 em.persist(newUser); //persist it for passing to db
//        }
		 
		//CREATE MULTIPLE NEW TICKETS (ADMIN)
		 for(int j=50; j<60; j++){
			 Ticket ticket1 = new Ticket( "Paradox", "12th of july", 40, 0);
			 em.persist(ticket1); //persist it for passing to db
        }
		
		
		
		//CREATE A NEW USER (USER, ADMIN)
//		User newUser = new User(1,"Stavros","Filippidis","6986221010", "filip123go", "Ss6946576152","stavros489@hotmail.com", 0);
//		em.persist(newUser); //persist it for passing to db

		
//		newUser.addTicket(ticket1);//Add the ticket to the joined table user_ticket (Creates the oneToMan relationship between the User and the Tickets )
//		existingTicket.addUser(1, "filip123go", "6946576152", "Stavros489@hotmail.com",  0); // this creates our one to many relationship
		
		//FIND A USER (ADMIN)
//		User existingUser = em.find(User.class, 2);
//		existingUser.addTicket(ticket1); // add a one to many relationship with the ticket1
//		System.out.println(existingUser);
		
		//FIND A TICKET (USER, ADMIN)
//		Ticket existingTicket = em.find(Ticket.class, 2);	
//		System.out.println(existingTicket);
		
        //RETURN ALL NOTES FROM ONE PARTICULAR TICKET (ADMIN)		
//		Set<Note> allNotes = existingTicket.getAllNotes();
//		
//		for(Note next: allNotes) {
//			System.out.println(next);
//		}
		
		
		//ADD A NEW NOTE (ADMIN)
//		Note newNote = new Note("Change of plans, make this public on june 10st");
//		em.persist(newNote);
//		existingTicket.addNote(newNote); // this creates our one to many relationship
		
		//UPDATE A TICKET (ADMIN)
//		Ticket ticket1 = em.find(Ticket.class, 2);
//		ticket1.setEventName("Paradox live in Athens");
		
		//REMOVE A TICKET (USER (IF TICKET RESERVED), ADMIN)
//		Ticket ticket1 = em.find(Ticket.class, 2);
//		em.remove(ticket1);
		
		//Create a single Note (ADMIN)
//		Note newNote = new Note("10% off on the last 100 tickets");		
//		em.persist(newNote);
		
		
		
		tx.commit();
		em.close();
	}

}
