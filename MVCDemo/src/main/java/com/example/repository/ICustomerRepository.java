package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer>{
	
	Customer findByContactNo(String contactNo);
	Customer findByCustName(String name);

}
