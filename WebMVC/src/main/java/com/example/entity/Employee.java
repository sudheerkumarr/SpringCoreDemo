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
	@NotNull
	@NotEmpty
	private String email;
	
	@Pattern(regexp="[0-9]{10}", message="length of contact number should be 10 digits")
	private String contactNo;

	// Getters & Setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContactNo() {
		return contactNo;
	}


	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo + "]";
	}
	

}
