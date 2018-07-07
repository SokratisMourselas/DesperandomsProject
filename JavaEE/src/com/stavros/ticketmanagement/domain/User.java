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

@Entity
@XmlRootElement
public class User  implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
//	private int userId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String userName;
	private String password;
	private String email;
	private int accessLevel;
	private double token;
	@OneToMany(cascade=CascadeType.MERGE)
	private Set<Ticket> tickets; // this is our collection so we can keep multiple instances of tickets
	
	
	public User() {
		super();
	}


	public User(String firstName, String lastName, String phoneNumber, String userName, String password, String email, int accessLevel) {
		super();
//		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.accessLevel = accessLevel; //accessLevel:0 = admin , accessLevel:1 = User
		this.tickets = new HashSet<Ticket>(); //a collection of tickets for every user
//		this.token = token;
		
		
		
	}



	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getAccessLevel() {
		return accessLevel;
	}


	public void setAccessLevel(int accessLevel) {
		this.accessLevel = accessLevel;
	}


	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", accessLevel=" + accessLevel + ", tickets=" + tickets + "]";
	}


	//bsn methods
	//add a ticket
	public void addTicket(Ticket newTicket) {
		this.tickets.add(newTicket);
	}
}
