package de.dks.model;

import java.io.Serializable;

import javax.persistence.*;

//@NamedQueries({
//	@NamedQuery(name = "Ticket.getAll", query = "SELECT e FROM ticketmonster e"),
//	@NamedQuery(name = "Ticket.isReserved", query = "SELECT e FROM ticketmonster e  WHERE e.isreserved = 0")
//})

@Entity
public class TicketModel implements Serializable {
	
	@Id
	@Column (name="ticketid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ticketId;
	
    @Column(name="eventname")
    private String eventName;
    
    @Column(name="location")
    private String location;
    
    @Column(name="price")
    private String price;
    
    @Column (name="isreserved")
    private String isReserved;
    
// GETTERS AND SETTERS
    
	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getIsReserved() {
		return isReserved;
	}

	public void setIsReserved(String isReserved) {
		this.isReserved = isReserved;
	}
	
	
	public TicketModel(int ticketId, String eventName, String location, String price, String isReserved) {
		this.ticketId = ticketId;
		this.eventName = eventName;
		this.location = location;
		this.price = price;
		this.isReserved = isReserved;
	}

	public TicketModel() {
		
	}

	@Override
	public String toString() {
		return "TicketModel [ticketId=" + ticketId + ", eventName=" + eventName + ", location=" + location + ", price="
				+ price + ", isReserved=" + isReserved + "]";
	}
    
    

	

}
