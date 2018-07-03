package com.stavros.ticketmanagement.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String userName;
	private String password;
	private String email;
	private int accessLevel;
	private double token;
	@OneToMany(cascade=CascadeType.PERSIST)
	private Set<Ticket> tickets; // this is our collection so we can keep multiple instances of tickets
	
	
	public User() {
		super();
	}


	public User(int userId,String firstName, String lastName, String phoneNumber, String userName, String password, String email, int accessLevel) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.accessLevel = accessLevel; //accessLevel:0 = admin , accessLevel:1 = User
		this.tickets = new HashSet<Ticket>(); //a collection of tickets for every user
		this.token = token;
	}



	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", accessLevel=" + accessLevel + ", token=" + token + ", tickets=" + tickets + "]";
	}


	//bsn methods
	//add a ticket
	public void addTicket(Ticket newTicket) {
		this.tickets.add(newTicket);
	}
}
