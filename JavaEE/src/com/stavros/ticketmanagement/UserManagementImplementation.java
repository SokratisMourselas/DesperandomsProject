package com.stavros.ticketmanagement;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import com.stavros.ticketmanagement.dataaccess.UserDataAccess;
import com.stavros.ticketmanagement.domain.User;

@Stateless
@WebService(name="UserManagementWebService")
public class UserManagementImplementation implements UserManagementServiceLocal {
	
	@EJB
	private UserDataAccess dao;

	@Override
	public void registerUser(User newUser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAllUsers() {
		return dao.findAll();
	}

}
