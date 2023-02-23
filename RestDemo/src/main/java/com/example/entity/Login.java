package com.example.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@NamedQuery(name="Login.getLoginByEmail", query="select l from Login l where l.email=?1")
public class Login {
	
	@Id
	@GeneratedValue
	private int loginId;
	
	private String email;
	private String password;
	private String role;

}
