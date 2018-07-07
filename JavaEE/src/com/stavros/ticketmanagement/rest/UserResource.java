package com.stavros.ticketmanagement.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.stavros.ticketmanagement.UserManagementServiceLocal;
import com.stavros.ticketmanagement.domain.User;


@Path("users")
@Stateless
public class UserResource{
	
	@EJB
	private UserManagementServiceLocal UserManagement;
	
	@GET
	@Produces("application/json")
	public List<User> getAllUsers(){
		List<User> results = new ArrayList<User>();
//		results.add(new User("George", "Tsampouris","6986221010", "George123go", "Pass", "Email", 8));
//		results.add(new User("Jenny", "Tsampouris","6986221010", "George123go", "Pass", "Email", 8));
		return UserManagement.getAllUsers();
	}
}
