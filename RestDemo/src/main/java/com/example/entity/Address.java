package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Address {
	
	@Id
	@GeneratedValue
	private int addId;
	private String city;
	private String state;

}
