package com.example.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Employee {
	
int empId;
	
	@NotNull
	@Size(min=3, max=10, message="Length of the name should be between 3 & 10 ")
	//@Min
	//@Max
	@NotEmpty(message="Name shouldn't be empty")
	@NotBlank(message="Name shouldn't be blank")
	private String name;
	
	@Email(message="Invalid email address")
	private String email;
	
	@Pattern(regexp="[0-9] {10,10}", message="length of contact number should be 10 digits")
	private String contactNo;
	
	

}
