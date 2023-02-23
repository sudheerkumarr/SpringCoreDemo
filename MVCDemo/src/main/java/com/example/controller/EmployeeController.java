package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.entity.Employee;
import com.example.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	IEmployeeService empServ;

	// IEmployeeService empServ = new EmployeeServiceImpl();

	// Return add-emp-form to user

	// POST
	@GetMapping("/addForm")
	public String addEmployeeForm(Model model) {

		// Update model obj with response
		Employee emp = new Employee();
		model.addAttribute("emp", emp);

		// redirect to emp-list.jsp page
		return "add-emp-form";
	}

	// Add emp to db
	@PostMapping("/addEmpResp")
	public String addEmployee(Model model, @ModelAttribute Employee emp) {
		// Call service method to add emp obj into db
		Employee newEmp = empServ.saveOrUpdateEmployee(emp);

		// Update model obj with response
		model.addAttribute("employee", newEmp);

		// redirect to emp-list.jsp page
		return "redirect:all";
		// return "emp-add-resp";
	}

	// GET
	@GetMapping("/all")
	public String getAllEmployees(Model model) {
		// Send get request to service to get all employees
		List<Employee> empList = empServ.getAllEmployees();

		// update model with empList
		model.addAttribute("empList", empList);
		System.out.println(empList);
		return "empList";

	};

	// DELETE
	@RequestMapping(value = "/deleteEmpById/{id}", method = RequestMethod.GET)
	public String deleteEmpById(@PathVariable("id") int empId) {
		System.out.println("empId: " + empId);

		// Send delete request to Service
		empServ.deleteEmployeeById(empId);

		// redirect to /employee/all jsp page
		return "redirect:/employee/all";
	}

	// UPDATE
	
	@RequestMapping("/updateEmpForm/{id}")
	public String updateEmployeeForm(@PathVariable("id") int empId , Model model) {

		// Get emp details from db
		Employee employee = empServ.getEmpById(empId);
		System.out.println("employee: " + employee);

		// update model attribute
		model.addAttribute("emp", employee);

		return "update-emp-form";
	}

	// Add emp to db
	// /employee/updateEmpResp
	@PostMapping("/updateEmpResp")
	public String updateEmployee(Model model, @ModelAttribute("emp") Employee emp) {
		// Call service method to add emp obj into db
		Employee updatedEmp = empServ.saveOrUpdateEmployee(emp);

		// Update model obj with response
		model.addAttribute("emp", updatedEmp);
	
		// redirect to emp-list.jsp page
		return "redirect:/employee/all";
	}

}
