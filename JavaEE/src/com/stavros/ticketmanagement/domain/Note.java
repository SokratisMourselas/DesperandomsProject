package com.stavros.ticketmanagement.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Note {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String text;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	public Note() {
		super();
	}


	public Note(String text) {
		super();
		this.text = text;
		this.date = new java.util.Date();
	}


	@Override
	public String toString() {
		return "Note raised at: " + this.date + " with contents: " + this.text;
	}
	
	
	
	
}
