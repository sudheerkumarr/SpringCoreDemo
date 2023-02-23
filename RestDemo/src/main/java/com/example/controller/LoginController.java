package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Login;
import com.example.service.ILoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	ILoginService loginService;
	
	@GetMapping("/get/byEmail/{email}")
	Login getLoginByEmail(@PathVariable("email") String email) {
		return loginService.getLoginByEmail(email);
	};

}
