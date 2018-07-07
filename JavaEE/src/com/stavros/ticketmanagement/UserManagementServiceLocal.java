package com.stavros.ticketmanagement;

import java.util.List;

import javax.ejb.Local;

import com.stavros.ticketmanagement.domain.User;

@Local
public interface UserManagementServiceLocal {
	
	public void registerUser(User newUser);
	public List<User> getAllUsers();

}
