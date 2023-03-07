package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String hello() {
		return "index";
	}

	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	
	@RequestMapping("/registerResp")
	public String registerResp() {
		return "registerResp";
	}
	
	// process input data
	@RequestMapping("/registerRespV2")
	public String registerRespV2(HttpServletRequest request, Model model) {
		String name = request.getParameter("firstName");
		model.addAttribute("msg", "Hello "+name+" !");
		return "registerRespV2";
	}
	

}
