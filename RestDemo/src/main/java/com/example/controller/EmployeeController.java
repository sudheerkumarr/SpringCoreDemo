package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	IEmployeeService empServ;
	
	// localhost:8080/employee/add
	@PostMapping("/add")
	Employee addEmployee(@RequestBody Employee emp) {
		
		Employee newEmp = empServ.addEmployee(emp);
		
		return newEmp;
		
	};
	
	// UPDATE
	// http://localhost:8080/employee/update
	@PutMapping("/update")
	Employee updateEmployee(@RequestBody Employee emp) {
		Employee updatedEmp = empServ.updateEmployee(emp);
		return updatedEmp;
	};
	
	// DELETE
	// http://localhost:8080/employee/delete/34 - DELETE
	@DeleteMapping("/delete/{id}")  
	void deleteEmployeeById(@PathVariable("id") int empId) {
		empServ.deleteEmployeeById(empId);
	};
	
	// GET
	// http://localhost:8080/employee/get/35 - GET
	@GetMapping("/get/{id}")
	Employee getEmpById(@PathVariable("id") int empId) {
		Employee emp = empServ.getEmpById(empId);
		return emp;
	};
//	Employee getEmpByName(String empName);
	
	// http://localhost:8080/employee/list
	@GetMapping("/list")
	List<Employee> getAllEmployees() {
		List<Employee> empList= empServ.getAllEmployees();
		return empList;
	};
	
	// get Employee by name
	// localhost:8082/employee/get/byName/Raj K
	@GetMapping("/get/byName/{name}")
	Employee getEmployeeByName(@PathVariable("name") String name) {
		Employee employee = empServ.getEmpByName(name);
		return employee;
	}
	
	// get employees based on salary
	@GetMapping("/get/bySalary/{salary1}/{salary2}")
	List<Employee> getEmployeesBySalary(@PathVariable("salary1") double sal1, @PathVariable("salary2") double sal2) {
		
		return empServ.getEmployeesBySalary(sal1, sal2);
		
	};


}
