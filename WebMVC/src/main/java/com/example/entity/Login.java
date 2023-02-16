package com.example.entity;


public class Login {
	
	
	private String email;
	private String password;
	private String role;
	
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Login [email=" + email + ", password=" + password + ", role=" + role + "]";
	}
	

}
