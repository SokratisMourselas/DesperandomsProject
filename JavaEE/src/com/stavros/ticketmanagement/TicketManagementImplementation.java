package com.stavros.ticketmanagement;

import java.util.List;

import javax.ejb.Stateless;

import com.stavros.ticketmanagement.dataaccess.TicketDataAccess;
import com.stavros.ticketmanagement.domain.Ticket;

@Stateless
public class TicketManagementImplementation implements TicketManagmentService {
	
	private TicketDataAccess dao;

	@Override
	public void registerTicket(Ticket newTicket) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Ticket> getAllTicket() {
		return null;
	}

	@Override
	public List<Ticket> searchByEventName(String eventName) {
		return dao.findByEventName(eventName);
	}


}
