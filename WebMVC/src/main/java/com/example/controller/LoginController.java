package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.entity.Login;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String login(Model model) {
		// Map/bind login obj to form
		model.addAttribute("login", new Login());
		
		// return jsp name
		return "login";
	}
	
	
	//@PostMapping("/loginResp")
	@RequestMapping(value="/loginResp", method=RequestMethod.POST)
	public String loginResp(@ModelAttribute Login login, Model model) {
		System.out.println(login);
		model.addAttribute("lg", login);
		return "loginResp";
	}

}
