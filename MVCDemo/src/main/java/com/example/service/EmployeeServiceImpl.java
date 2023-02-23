package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.IEmployeeRepository;


@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	IEmployeeRepository empRepo;

	// ADD Employee
	@Override
	public Employee saveOrUpdateEmployee(Employee emp) {
		return empRepo.save(emp);
	}

	// DELETE
	@Override
	public void deleteEmployeeById(int empId) {
		empRepo.deleteById(empId);
	}

	// GET - ByID
	@Override
	public Employee getEmpById(int empId) {
		return empRepo.findById(empId).get();
	}
	
	// GET - ByName
	@Override
	public Employee getEmpByName(String empName) {
		return empRepo.findByEmpName(empName);
	}

	// GET - All Employees
	@Override
	public List<Employee> getAllEmployees() {
		return empRepo.findAll();
	}

	

	
}
