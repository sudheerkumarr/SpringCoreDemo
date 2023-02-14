package com.example.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myAddress")
@Scope("prototype")
public class Address {

	private String city;
	private String state;
	
	// Constructors
	public Address() {
		super();
	}
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	
	// Getters& Setters
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	
}
