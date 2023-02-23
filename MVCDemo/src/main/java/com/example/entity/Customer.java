package com.example.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Customer {
	
	@Id
	@GeneratedValue
	private int custId;
	private String custName;
	private String contactNo;
	
	// OneToOne - bidirectional
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customer_login_fk")
	private Login login;

}
