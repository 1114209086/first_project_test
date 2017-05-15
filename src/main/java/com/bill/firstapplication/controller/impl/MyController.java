package com.bill.firstapplication.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.bill.firstapplication.modol.User;

@Controller
public class MyController {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/username")
	@ResponseBody
	public String getUserName(){
		log.info("getUserName", "in");
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
	@RequestMapping(value="/modelmap" ,method=RequestMethod.POST)
	public String loginWithModelMap(@RequestParam(defaultValue="杨明飞")String name,Model model){
		model.addAttribute("name", name);
		return "modelmap";
	}
}