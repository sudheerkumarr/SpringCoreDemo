package com.example.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;

public class Login {
	
	// Fields
	@NotNull
	@NotBlank
	@NotEmpty
	@Email
	private String email;
	
	@Pattern(regexp="[a-zA-Z0-9@$%] {3,8}", message="password length should be between  3 and 8 chars")
	private String password;
	
	@NotNull
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
		return "Login [email=" + email + ", password=" + password + "]";
	}
}
