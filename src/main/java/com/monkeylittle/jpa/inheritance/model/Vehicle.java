package com.monkeylittle.jpa.inheritance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Vehicle {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	private Colour colour;
	
	public Vehicle(Colour colour) {
	
		this.colour = colour;
	}
	
	public Vehicle() {
		
	}
	
	public Long getId() {
		
		return id;
	}

	public Colour getColour() {
		
		return colour;
	}

	public void setColour(Colour colour) {
		
		this.colour = colour;
	}
}
