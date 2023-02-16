package com.example.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping("/add")
	private String addEmployeeForm(Model model) {
		Employee emp = new Employee();
		model.addAttribute("emp", emp);
		return "employee";
	}

	@PostMapping("/resp")
	private String addEmployeeResp(Model model, @Valid @ModelAttribute("emp") Employee emp, BindingResult br) {
		System.out.println(br.hasErrors());
		if (br.hasErrors()) {
			return "employee";
		} else {
			System.out.println(emp);
			model.addAttribute("emp", emp);
			return "empAddResp";
		}
	}

}
