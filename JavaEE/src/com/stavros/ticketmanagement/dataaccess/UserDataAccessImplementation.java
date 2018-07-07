package com.stavros.ticketmanagement.dataaccess;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.stavros.ticketmanagement.domain.User;


@Stateless
public class UserDataAccessImplementation implements UserDataAccess {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(User newUser) {
		em.persist(newUser);
		
	} 
	
	public List<User> findAll() {
//		Query q=em.createNamedQuery("selectAllTickets");
		Query q = em.createQuery("SELECT User FROM User user");	
		List<User> results = q.getResultList();
		return results;
	}

}
