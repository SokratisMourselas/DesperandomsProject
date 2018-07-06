// This is the Service Tier, provide a simple interface so the client can call easily. Here all all the business level methods
package com.stavros.ticketmanagement;

import java.util.List;

import javax.ejb.Remote;

import com.stavros.ticketmanagement.domain.Ticket;

@Remote
public interface TicketManagmentServiceRemote {
	
	public void registerTicket(Ticket  newTicket);
	public List<Ticket> getAllTicket();
	public List<Ticket> searchByEventName(String EventName);

}
