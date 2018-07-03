//We use this DAO (Data Access Object) to make transactions with the db. It is better to have all the transactions in a separate class
package com.stavros.ticketmanagement.dataaccess;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.stavros.ticketmanagement.domain.Ticket;

@Stateless
public class TicketDataAccessImplementation implements TicketDataAccess {

	@Override
	public void insert(Ticket newTicket) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Ticket> findAll() {
		List<Ticket> tempList = new ArrayList<Ticket>();
		tempList.add(new Ticket(1, "temp", "temp", 100000, 1));
		return tempList;
	}

	@Override
	public List<Ticket> findByEventName(String eventName) {
		List<Ticket> tempList = new ArrayList<Ticket>();
		tempList.add(new Ticket(1, "temp", "temp", 100000, 1));
		return tempList;
	}


}
