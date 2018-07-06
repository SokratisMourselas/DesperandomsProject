package com.stavros.ticketmanagement.backingBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="loggedInUserPageBean")
public class LoggedInUserPageBean {
	
	public String showUserProfile() {
		
		return "userDetail";
	}

}
