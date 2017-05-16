package com.bill.firstapplication.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bill.firstapplication.controller.BaseController;
import com.bill.firstapplication.modol.User;

@Controller
public class UserController implements BaseController {

	@RequestMapping("/username")
	@ResponseBody
	public String getUserName(){
		return "Bill";
	}
	@RequestMapping("/user")
	@ResponseBody
	public User getUser(){
		User user = new User();
		return user;
	}
}
