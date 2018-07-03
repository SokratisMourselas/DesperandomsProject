// not used by the code yet
package com.stavros.test;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remove;
import javax.ejb.Stateful;

@Stateful
public class ShoppingCartSessionImplementation implements ShoppingCartSession {
	
	private List<String> items;

	public ShoppingCartSessionImplementation() {
		this.items = new ArrayList<String>();
	}
	
	@Override
	public void addItem(String item){
		items.add(item);
	}
	
	
	@Override
	public List<String> getAllItems(){
		return this.items;
	}
	
	@Override
	@Remove
	public void checkout() {
		// add the items to the db
	}

}
