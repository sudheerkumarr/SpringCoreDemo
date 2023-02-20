package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.service.IEmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	IEmployeeService empServ;
	@PostMapping("/employee/add")
	Employee addEmployee(@RequestBody Employee emp) {
		System.out.println(emp);
		return empServ.addEmployee(emp);
	};
	
	
	
//	Employee updateEmployee(Employee emp);
//	Employee updateEmployeeSalary(int id, Double salary);
//	Employee deleteEmployeeById(int empId);
//	List<Employee> getAllEmployees();
//	Employee getEmployeeById(int empId);
//	Employee getEmployeeByName(String name);

}
