package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Customer;
import com.example.repository.ICustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	ICustomerRepository custRepo;

	// add customer
	@Override
	public Customer addCustomer(Customer customer) {
		
		return custRepo.save(customer);
	}

	// Get all customers
	@Override
	public List<Customer> getAllCustomers() {
		
		return custRepo.findAll();
	}

}
