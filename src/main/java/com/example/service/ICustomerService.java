package com.example.service;

import java.util.List;

import com.example.entity.Customer;

public interface ICustomerService {
	
	// addCustomer, deleteCustomerById, updateCustomer, getCustomerById, , getAllCustomers, getContact
	Customer addCustomer(Customer customer);
	List<Customer> getAllCustomers();
	
}
