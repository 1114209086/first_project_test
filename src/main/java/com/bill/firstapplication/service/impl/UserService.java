package com.bill.firstapplication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bill.firstapplication.dao.impl.UserDao;
import com.bill.firstapplication.modol.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	public String addUser(User u){
		userDao.save(u);
		return "success";
	}
}
