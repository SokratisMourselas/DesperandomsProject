package com.stavros.ticketmanagement.backingBeans;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.stavros.ticketmanagement.TicketManagementServiceLocal;
import com.stavros.ticketmanagement.domain.Ticket;


@ManagedBean(name="allTicketsPageBean")
public class AllTicketsPageBean {

	@EJB
	private TicketManagementServiceLocal ticketService;
	
	public List<Ticket> getAllTickets(){
		return ticketService.getAllTicket();
	}
}
