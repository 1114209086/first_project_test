package com.bill.firstapplication.service.impl;

import org.springframework.stereotype.Service;

import com.bill.firstapplication.service.BaseService;

@Service
public class LoginService implements BaseService {

	public boolean validationUser(String userid, String password){
		return  password.equalsIgnoreCase("123456");
	}
}
