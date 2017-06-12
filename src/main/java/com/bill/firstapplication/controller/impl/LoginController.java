package com.bill.firstapplication.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.bill.firstapplication.controller.BaseController;
import com.bill.firstapplication.service.impl.LoginService;

@Controller
public class LoginController implements BaseController{
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private LoginService service;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Map<String, Object> map){
		log.debug(this.getClass().getName());
		return "login";
	}
	@RequestMapping(value="/login" ,method=RequestMethod.POST)
	public String showWelcomePage(@RequestParam String account,@RequestParam String password,Model model){
		boolean isValidUser = service.validationUser(account, password);
		if (!isValidUser) {
			return "login";
		}
		model.addAttribute("name", account);
		return "welcome";
	}
}