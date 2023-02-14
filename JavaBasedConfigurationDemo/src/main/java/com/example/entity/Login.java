package com.example.entity;

import org.springframework.stereotype.Component;

@Component
public class Login {
	
	// Fields/Variables
	private String email;
	private String password;
	

	// Constructors
	public Login() {
		super();
	}
	public Login(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	// Getters & Setters
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Login [email=" + email + ", password=" + password + "]";
	}
}
