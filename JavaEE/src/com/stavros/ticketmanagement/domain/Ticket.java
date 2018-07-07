//Domain class. A class that represents the actual real word object (in this case a ticket)
package com.stavros.ticketmanagement.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@Entity //Make the class usable from JPA (We store data to db with this class)
@XmlRootElement
public class Ticket implements java.io.Serializable {
	
	

	public Ticket() {
		//required by JPA but not used
		super();
	}


	@Id //Used from JPA as primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ticketId;
	private String eventName;
	private String eventTime;
	private int price;
	private int isReserved;
	 
//	@OneToMany(cascade=CascadeType.MERGE) // in the events of an un-persistence obj being found in the Nnotes collection jpa is free to automatically call persist on that obj
//	private Set<Note> notes; //this is used to keep a reference of the relative notes to each ticket. Its a collection (Set is better for DBs)Set: collection on obj with no particular order and no duplicate obj


	public Ticket(String eventName, String eventTime, int price, int isReserved) {
		super();
//		this.notes = new HashSet<Note>();
		this.eventName = eventName;
		this.eventTime = eventTime;
		this.price = price;
		this.isReserved = isReserved;
	}
	

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
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

//	public Set<Note> getNotes() {
//		return notes;
//	}

//	public void setNotes(Set<Note> notes) {
//		this.notes = notes;
//	}

	public String getEventName() {
		return eventName;
	}


	//this is what the find*Ticket will return in TestHarness
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", eventName=" + eventName + ", eventTime=" + eventTime + ", price="+ price + ", isReserved=" + isReserved + "]";
	}
	
	//Regular methods, for example -10% to a ticket
	public void setEventName(String newEventName) {
		this.eventName = newEventName; //updates the eventName in the db
	}
	
	//bsn methods
	//add a note
//	public void addNote(String newNoteText) {
//		Note newNote=new Note(newNoteText);
//		this.notes.add(newNote);
//	}
	
	//add a user
//	public void addUser(int userId, String userName, String password, String email, int accessLevel) {
//		User newUser=new User(userId, userName, password, email, accessLevel);
//		this.users.add(newUser);
//	}
	
	

//	public Set<Note> getAllNotes() {
//		// TODO Auto-generated method stub
//		return this.notes;
//	}
	
	
}


