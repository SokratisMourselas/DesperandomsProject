package com.stavros.ticketmanagement;

import java.util.List;

import javax.ejb.Remote;

import com.stavros.ticketmanagement.domain.Ticket;

@Remote
public interface TicketManagmentService {
	
	public void registerTicket(Ticket  newTicket);
	public List<Ticket> getAllTicket();
	public List<Ticket> searchByEventName(String EventName);

}
