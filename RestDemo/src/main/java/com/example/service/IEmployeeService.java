package com.example.service;

import java.util.List;

import com.example.entity.Employee;

public interface IEmployeeService {
	

	Employee addEmployee(Employee emp);
	Employee updateEmployee(Employee emp);
	Employee updateEmployeeSalary(int id, Double salary);
	Employee deleteEmployeeById(int empId);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(int empId);
	Employee getEmployeeByName(String name);

}
