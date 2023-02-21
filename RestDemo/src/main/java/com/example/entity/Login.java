package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Login {
	@Id
	private String email;
	private String password;
	private String role;

}