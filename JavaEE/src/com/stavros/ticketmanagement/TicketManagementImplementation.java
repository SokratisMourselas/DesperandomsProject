package com.stavros.ticketmanagement;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import com.stavros.ticketmanagement.dataaccess.TicketDataAccess;
import com.stavros.ticketmanagement.domain.Ticket;

@Stateless
@WebService(name="TicketManagementWebService")
public class TicketManagementImplementation implements TicketManagmentServiceRemote, TicketManagementServiceLocal  {
	
	@EJB
	private TicketDataAccess dao;
	

	public List<Ticket> getAllTicket() {
		return dao.findAll();
	}


	public void registerTicket(Ticket newTicket) {
		dao.insert(newTicket);

	}

	public List<Ticket> searchByEventName(String eventName) { 
		return dao.findByEventName(eventName);
	}


	@Override
	public List<Ticket> findByTicketId(int ticketId) {
		// TODO Auto-generated method stub
		return dao.findByTicketId(ticketId);
	}


	@Override
	public void reserveTicket(int ticketId) {
		 dao.reserveTicket(ticketId);
		
	}

}
