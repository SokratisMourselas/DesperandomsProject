package com.stavros.ticketmanagement.backingBeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.stavros.ticketmanagement.TicketManagementServiceLocal;
import com.stavros.ticketmanagement.domain.Ticket;

@ManagedBean(name="enterTicketBean")
public class EnterTicketBean {
	
	private String eventName;
	private String eventTime;
	private int price;
	private int isReserved;
	
	@EJB
	private TicketManagementServiceLocal ticketService;	
	
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventTime() {
		return eventTime;
	}
	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getIsReserved() {
		return isReserved;
	}
	public void setIsReserved(int isReserved) {
		this.isReserved = isReserved;
	}
	
	public String createTicket() { //must return a String and must not have any params
		
		Ticket newTicket = new Ticket(eventName, eventTime, price, isReserved);
		
		try {
			ticketService.registerTicket(newTicket);
			return "allTickets"; //page thank you
		} catch (Exception e) {
			e.printStackTrace();
			return "systemDown"; //page system dowv
		}

		
	}
	
	

}
