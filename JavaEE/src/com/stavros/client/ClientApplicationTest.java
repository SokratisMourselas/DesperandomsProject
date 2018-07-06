// not used by the code just for test (needs initialization)
package com.stavros.client;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.stavros.ticketmanagement.TicketManagmentServiceRemote;
import com.stavros.ticketmanagement.domain.Ticket;

public class ClientApplicationTest {

	public static void main(String[] args) {
		
		try {
			
			Context jndi = new InitialContext();
				
			TicketManagmentServiceRemote service =(TicketManagmentServiceRemote) jndi.lookup("java:global/TicketMaanagement/TicketManagementImplrmrntation");
			
			List<Ticket> tickets = service.getAllTicket();
			
			for(Ticket next : tickets) {
				System.out.println(next);
			}
		}
			catch (NamingException e)
		{
			System.out.println(e);
		}
	}

}
