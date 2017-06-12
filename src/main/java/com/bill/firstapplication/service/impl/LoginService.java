package com.bill.firstapplication.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bill.firstapplication.dao.impl.UserDao;
import com.bill.firstapplication.modol.User;
import com.bill.firstapplication.service.BaseService;

@Service
public class LoginService implements BaseService {
	
	private User currentUser;

	@Autowired
	UserDao dao;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public boolean validationUser(String account, String password){
		boolean isvalid = false;
		List<User> userList = dao.findByAccount(account);
		if (userList.size()>0) {
			User aimUser = userList.get(0);
			currentUser = aimUser;
			isvalid = aimUser.getPassword().equals(password);
		}
		logger.debug("account: "+ account + "  isvalid: " + isvalid );
		return  isvalid;
	}

	public User getCurrentUser() {
		return currentUser;
	}
}
