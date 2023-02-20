package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.IEmployeeRepository;

@Service
public class EmployeeSeviceImpl implements IEmployeeService{
	
	@Autowired
	IEmployeeRepository empRepo;

	@Override
	public Employee addEmployee(Employee emp) {
		// Save emp in db
		System.out.println("Service: "+emp);
		Employee newEmp = empRepo.save(emp);
		System.out.println("Service: "+newEmp);
		return newEmp;
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		
		return null;
	}

	@Override
	public Employee updateEmployeeSalary(int id, Double salary) {
		
		return null;
	}

	@Override
	public Employee deleteEmployeeById(int empId) {
		
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return null;
	}

	@Override
	public Employee getEmployeeById(int empId) {
		
		return null;
	}

	@Override
	public Employee getEmployeeByName(String name) {
		
		return null;
	}

	
}
