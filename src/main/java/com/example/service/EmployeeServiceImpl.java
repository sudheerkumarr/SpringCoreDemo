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
	public Employee addEmployee(Employee emp) {
		return empRepo.save(emp);
		
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		// Get emp from db
		Employee dbEmp = empRepo.findById(emp.getEmpId()).get();
		// update emp details
		dbEmp.setEmpName(emp.getEmpName());
		dbEmp.setSalary(emp.getSalary());
		dbEmp.setContactNo(emp.getContactNo());
		// save and return updated emp details
		return empRepo.save(dbEmp);
		
	}

	@Override
	public void deleteEmployeeById(int empId) {
		empRepo.deleteById(empId);
		
	}

	@Override
	public Employee getEmpById(int empId) {
		
		return empRepo.getById(empId);
	}

	@Override
	public Employee getEmpByName(String empName) {
		
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return empRepo.findAll();
	}

}
