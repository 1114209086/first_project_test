package com.bill.firstapplication.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

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
	public String index(Map<String, Object> map){
		User user = new User();
		user.setName("bill");
		user.setAge("27");
		user.setSex("Man");
		map.put("hello", user);
//		ModelAndView modelAndView = new ModelAndView("index");
		return "index";
	}
}