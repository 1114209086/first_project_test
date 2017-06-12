package com.bill.firstapplication.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bill.firstapplication.controller.BaseController;
import com.bill.firstapplication.modol.User;
import com.bill.firstapplication.service.impl.UserService;

@Controller
public class UserController implements BaseController {

	@Autowired
	UserService userService;
	
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
	@RequestMapping(value="/users/{id}" ,method=RequestMethod.GET)
	@ResponseBody
	public String addUser(@PathVariable Integer id){
		User user = new User();
		user.setName("zhangsan");
		userService.addUser(user);
		return "success";
	}
}
