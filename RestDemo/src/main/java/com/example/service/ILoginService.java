package com.example.service;

import com.example.entity.Login;

public interface ILoginService {
	
	Login getLoginByEmail(String email);

}
