package com.example.service;

import com.example.entity.Login;

public interface ILoginService {
	
	Login resetPassword(String email, String oldPassword, String newPassword);
	Login forgotPassword(String email, String password);
	Login addLogin(Login login);
	void deleteLoginById(String email);
	Login updateLogin(Login login);
	Login getLoginByEmail(String email);
	

}
