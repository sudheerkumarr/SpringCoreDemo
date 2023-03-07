package com.example.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.Login;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String loginForm(Model model) {
		// Map Login obj to Login form
		model.addAttribute("login", new Login());
		return "login";
	}
	
	// without validation
//	@RequestMapping("/loginResp")
//	public String loginResp(@ModelAttribute("login") Login login) {
//		System.out.println(login.getEmail());
//		return "loginResp";
//	}
	
	@RequestMapping("/loginResp")
	public String loginResp(@Valid @ModelAttribute("login") Login login, BindingResult br) {
		System.out.println(br);
		if(br.hasErrors()) {
			return "login";
		} else {
			System.out.println(login.getEmail());
			return "loginResp";
		}
	}

}
