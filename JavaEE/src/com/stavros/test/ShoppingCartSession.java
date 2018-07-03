// not used by the code yet
package com.stavros.test;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface ShoppingCartSession {

	void addItem(String item);

	List<String> getAllItems();

	void checkout();

}