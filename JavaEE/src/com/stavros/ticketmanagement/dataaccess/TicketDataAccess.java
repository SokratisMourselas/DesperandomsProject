package com.stavros.ticketmanagement.dataaccess;

import java.util.List;

import javax.ejb.Local;

import com.stavros.ticketmanagement.domain.Ticket;

@Local
public interface TicketDataAccess {
	
	public void insert (Ticket newTicket);
	public List<Ticket> findAll();
	public List<Ticket> findByEventName(String eventName);

}
