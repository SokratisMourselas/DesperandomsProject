package com.stavros.ticketmanagement.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.ServiceUnavailableException;
import javax.ws.rs.core.Application;

import com.stavros.ticketmanagement.TicketManagementServiceLocal;
import com.stavros.ticketmanagement.domain.Ticket;

@ApplicationPath("/")
@Path("tickets")
@Stateless
public class TicketResource extends Application {
	
	@EJB
	private TicketManagementServiceLocal ticketManagement;
	
	@GET
	@Produces("application/json")
	public List<Ticket> getAllTickets(){
		return ticketManagement.getAllTicket();
	}
	
	@GET
	@Produces("application/json")
	@Path("{ticketId}") // marches the url of /tickets/ticketId
	public List<Ticket> findTicketById(@PathParam("ticketId") int ticketId) {
//		return new Ticket(3, "TestNam2001e", "Test time2001", 100, 0);
		ticketManagement.reserveTicket(ticketId);
		return ticketManagement.findByTicketId(ticketId);
	}
	
	//create new ticket
	
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Ticket createNewTicket(Ticket ticket){
		try {
		ticketManagement.registerTicket(ticket);
		} catch (ServiceUnavailableException e) {
			return null;
		}
	return ticket;
	}
}
