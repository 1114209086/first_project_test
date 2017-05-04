package com.bill.firstapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

import com.bill.firstapplication.modol.User;

@Controller
public class MyController {

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

	@RequestMapping("/index")
	public String index(){
//		ModelAndView modelAndView = new ModelAndView("index");
		return "index";
	}
}