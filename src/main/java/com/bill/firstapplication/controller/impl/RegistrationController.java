package com.bill.firstapplication.controller.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bill.firstapplication.controller.BaseController;
import com.bill.firstapplication.modol.User;
import com.bill.firstapplication.service.impl.UserService;

@Controller
public class RegistrationController implements BaseController{

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserService service;
	
	@RequestMapping(value = "/registration", method = RequestMethod.GET )
	public String registrationPage(){
		return "registration";
	}
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String register(User user, Model model){
		if (service.addUser(user).equals("success")) {
			model.addAttribute("user",user);
			logger.info(user.toString());
			return "welcome";
		}
		return "error";
	}
}
