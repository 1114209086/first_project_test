package com.bill.firstapplication.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bill.firstapplication.modol.User;
import com.bill.firstapplication.service.BaseService;

@Service
public class LoginService implements BaseService {

	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public boolean validationUser(String account, String password){
		
		return  password.equalsIgnoreCase("123456");
	}

	public User getCurrentUser() {
		return new User();
	}
}
