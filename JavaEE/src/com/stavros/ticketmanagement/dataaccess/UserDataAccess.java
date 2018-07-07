package com.stavros.ticketmanagement.dataaccess;

import java.util.List;

import javax.ejb.Local;

import com.stavros.ticketmanagement.domain.Ticket;
import com.stavros.ticketmanagement.domain.User;

@Local
public interface UserDataAccess {
	public void insert (User newUser);
	public List<User> findAll();

}
