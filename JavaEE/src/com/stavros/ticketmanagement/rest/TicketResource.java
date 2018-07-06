package com.stavros.ticketmanagement.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;

import com.stavros.ticketmanagement.domain.Ticket;

@ApplicationPath("tickets")
@Path("tickets")
public class TicketResource {
	
	@GET
	@Produces("application/xml")
	public List<Ticket> getAllTickets(){
		List<Ticket> results= new ArrayList<Ticket>();
		results.add(new Ticket(1, "TestName", "Test time", 100, 0));
		results.add(new Ticket(2, "TestName2", "Test time2", 102, 0));
		return results;
	}

}
