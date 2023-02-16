package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepositoryImpl;
import com.example.repository.IEmployeeRepository;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	IEmployeeRepository empRepo;
	
	@PostMapping("/addForm")
	public String addEmployeeForm(Employee emp) {
		return "addEmpForm";
	}
	
	@GetMapping("/updateForm")
	public String updateEmployeeForm(Model model, Employee emp) {
		Employee employee = empRepo.getEmployeeById(emp.getEmpId());
		model.addAttribute("uEmp", employee);
		return "updatedEmpForm";
	}
	
	@PutMapping("/updateResp")
	public String updateEmployee(@ModelAttribute("uEmp") Employee emp, Model model) {
		Employee updatedEmp= empRepo.updateEmployee(emp);
		model.addAttribute("uEmp", updatedEmp);
		return "updatedEmpResp";
	}
	@GetMapping("/getById/{id}")
	public String getEmployeeById(int empId, Model model) {
		Employee emp= empRepo.getEmployeeById(empId);
		model.addAttribute("employee", emp);
		return "getEmpByIdResp";
	}
	@GetMapping("/getAll")
	public String getAllEmployees(Model model) {
		List<Employee> empList= empRepo.getAllEmployees();
		model.addAttribute("empList", empList);
		return "empList";
	}
	@DeleteMapping("/deleteById/{empId}")
	public String deleteById(@PathVariable("id") int empId) {
		empRepo.deleteEmployeeById(empId);
		return "redirect:getAll";
	}

}
