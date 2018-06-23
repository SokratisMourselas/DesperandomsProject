package org.jboss.jdf.example.ticketmonster.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class TicketCategory {
	
	/* Declaration of fields */
	/**
	* The synthetic id of the object.
	*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	@NotEmpty
	private String description;
	
	/* Boilerplate getters and setters */
	public Long getId() {
	return id;
	}
	public void setId(Long id) {
	this.id = id;
	}

	
	public String getDescription() {
	  return description;
	}
	
	public void setDescription(String description) {
	  this.description = description;
	} 
	
	@Override
	public String toString() {
	  return description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TicketCategory other = (TicketCategory) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		return true;
	}
}



