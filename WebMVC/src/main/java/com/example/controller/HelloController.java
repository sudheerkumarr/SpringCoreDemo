package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping("/")
	public String hello() {
		return "index";
	}
	
	// Read form date and print
	// Get request & url - /registerForm
	@RequestMapping("/registerForm")
	public String registerForm() {
		return "registerForm";
	}
	
//	@RequestMapping("/registerResp")
//	public String registerResp() {
//		return "registerResp";
//	}
	
    // process the data & return
//	@RequestMapping("/registerResp")
//	public String registerResp(HttpServletRequest request, Model model) {
//		String fName = request.getParameter("firstName");
//		String lName = request.getParameter("lastName");
//		// Data processing
//		System.out.println(fName + " "+lName);
//		String fullName = fName + " "+lName;
//		
//		// add processed data into model 
//		model.addAttribute("fullName", fullName);
//		
//		return "registerResp";
//	}
	
	
	// Get info from the register form using @RequestParam
	@RequestMapping("/registerResp")
	public String registerResp(@RequestParam("firstName") String fName,  @RequestParam("lastName") String lName, Model model) {
		//String fName = request.getParameter("firstName");
		//String lName = request.getParameter("lastName");
		// Data processing
		System.out.println(fName + " "+lName);
		String fullName = fName + " "+lName;
		
		// add processed data into model 
		model.addAttribute("fullName", fullName);
		
		return "registerResp";
	}
	
	
}
