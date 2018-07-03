// not used by the code just for test (needs initialization)
package com.stavros.client;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.stavros.test.ShoppingCartSession;

public class StatefulClientTest {
public static void main(String[] args) {
		
		try {
			
			Context jndi = new InitialContext();
			ShoppingCartSession cart =(ShoppingCartSession) jndi.lookup("java:global/TicketMaanagement/TicketManagementImplementation");
			
			cart.addItem("Tennis");
			cart.addItem("TOASTER");
			
			List<String> items = cart.getAllItems();
			
			for(String next : items) {
				System.out.println(next);
			}
		}
			catch (NamingException e)
		{
			System.out.println(e);
		}
	}

}
