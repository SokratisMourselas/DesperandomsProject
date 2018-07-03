package com.stavros.ticketmanagement.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	private String password;
	private String email;
	private int accessLevel;
	
	
	public User() {
		super();
	}


	public User(int userId, String userName, String password, String email, int accessLevel) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.accessLevel = accessLevel; //accessLevel:0 = admin , accessLevel:1 = User
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", accessLevel=" + accessLevel + "]";
	}
}
