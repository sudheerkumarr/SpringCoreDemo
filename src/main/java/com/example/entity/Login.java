package com.example.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Login {
	
	@Id
	@GeneratedValue
	private int loginId;
	
	private String email;
	private String password;
	private String role;

	// OneToOne - bidirectional
	@OneToOne(mappedBy="login")
	private Customer customer;
}
