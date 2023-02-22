package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entity.Customer;
import com.example.service.ICustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	ICustomerService custServ;
	
	// addCustomer, deleteCustomerById, updateCustomer, getCustomerById, , getAllCustomers, getContact

	@GetMapping("/customer/addForm")
	public String addCustomerForm(Model model) {
		
		// Create customer obj
		Customer customer = new Customer();
		
		// bind customer obj to form
		model.addAttribute("customer", customer);
		
		return "cust-reg-form";	
	}
	
	// addCutomer
	@PostMapping("/customer/add")
	public String addCustomer(@ModelAttribute("customer") Customer customer) {
		Customer cust = custServ.addCustomer(customer);
		
		return "redirect:/customer/all";	
	}
	
	// Get all customers
	@GetMapping("/customer/all")
	public String getAllCustomers(Model model) {
		List<Customer> custList = custServ.getAllCustomers();
		
		model.addAttribute("custList", custList );
		
		return "cust-list";
	}
	
}
