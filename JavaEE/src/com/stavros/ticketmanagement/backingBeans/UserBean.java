package com.stavros.ticketmanagement.backingBeans;

import java.util.Date;

import javax.faces.bean.ManagedBean;

@SuppressWarnings("deprecation")
@ManagedBean(name="userBean")
public class UserBean {

	private String firstName;
	private Date currentDateAndTime;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public Date getCurrentDateAndTime() {
		return currentDateAndTime;
	}

	public void setCurrentDateAndTime(Date currentDateAndTime) {
		this.currentDateAndTime = currentDateAndTime;
	}

	public String greetUser(){
		//1. Do business processes
		currentDateAndTime = new java.util.Date();
		
		//2.Forward to the next page here we can have multiple webpages
		return "welcome"; //the page we are going next
	}
	
}
