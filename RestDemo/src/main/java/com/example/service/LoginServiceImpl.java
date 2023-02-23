package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Login;
import com.example.repository.ILoginRepository;

@Service
public class LoginServiceImpl implements ILoginService {

	@Autowired
	ILoginRepository loginRepo;
	
	@Override
	public Login getLoginByEmail(String email) {
		return loginRepo.getLoginByEmail(email);
	}

}
