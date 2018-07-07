//We use this DAO (Data Access Object) to make transactions with the db. It is better to have all the transactions in a separate class
package com.stavros.ticketmanagement.dataaccess;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.stavros.ticketmanagement.domain.Ticket;

@Stateless
public class TicketDataAccessImplementation implements TicketDataAccess {
	
	@PersistenceContext
	private EntityManager em;




	public List<Ticket> findAll() {
//		Query q=em.createNamedQuery("selectAllTickets");
		Query q = em.createQuery("SELECT ticket FROM Ticket ticket");	
		List<Ticket> results = q.getResultList();
		return results;
	}

	public List<Ticket> findByEventName(String eventName) {
		Query q = em.createQuery("SELECT ticket FROM Ticket ticket WHERE ticket.eventName = :SearchEvent");
		q.setParameter("SearchEvent", eventName);
		return q.getResultList();
	}
	
	public List<Ticket> findByTicketId(int ticketId) {
		Query q = em.createQuery("SELECT ticket FROM Ticket ticket WHERE ticket.ticketId = :SearchEvent");
		q.setParameter("SearchEvent", ticketId);
		return q.getResultList();
	}
	
	public void insert(Ticket newTicket) {
		em.persist(newTicket);
		
	} 
	
	public void reserveTicket(int ticketId) {
//		Query q=em.createNamedQuery("selectAllTickets");
		Query q = em.createQuery("UPDATE Ticket ticket SET ticket.isReserved=1 WHERE ticket.ticketId = :SearchEvent");
		q.setParameter("SearchEvent", ticketId);
		q.executeUpdate();

	}


}
