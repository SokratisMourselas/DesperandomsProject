package com.stavros.ticketmanagement;

import java.util.List;

import javax.ejb.Local;

import com.stavros.ticketmanagement.domain.Ticket;

@Local
public interface TicketManagementServiceLocal {

	public void registerTicket(Ticket  newTicket);
	public List<Ticket> getAllTicket();
	public List<Ticket> searchByEventName(String EventName);
	public List<Ticket> findByTicketId(int ticketId);
	public void reserveTicket(int ticketId);

}
