package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entity.Login;
import com.example.service.ILoginService;

@Controller
public class LoginController {
	
	@Autowired
	ILoginService loginServ;
	
	// Get login form
	@GetMapping("/login/form")
	public String loginForm(Model model) {
		Login login = new Login();
		model.addAttribute("login", login);
		return "login-form";
	}
	
	// Validate user credentials with db credentials
	@PostMapping("/login")
	public String validateLogin(@ModelAttribute("login") Login login) {
		Login lg = loginServ.validateLogin(login);
		if(lg!=null) {
			return "redirect:/customer/all";
		} else {
			return "redirect:/login/form";
		}
	}

}
