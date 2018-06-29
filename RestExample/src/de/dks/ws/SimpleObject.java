//This is called by the RestService Class
package de.dks.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement // its value is represented as XML element in an XML document.
public class SimpleObject {
	
	
	public SimpleObject() { //default constructor needed for .. reasons
	}
	
	public SimpleObject(int id, String name) { //generated constructor
		super();
		this.id = id;
		this.name = name;
	}
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SimpleObject [id=" + id + ", name=" + name + "]";
	}

}
