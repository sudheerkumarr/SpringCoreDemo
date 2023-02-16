package com.example.repository;

import java.util.List;

import com.example.entity.Employee;

public interface IEmployeeRepository {
	
	Employee addEmployee(Employee emp);
	Employee getEmployeeById(int empId);
	List<Employee> getAllEmployees();
	Employee deleteEmployeeById(int empId);
	
}
