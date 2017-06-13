package com.bill.firstapplication.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bill.firstapplication.controller.BaseController;

@Controller
public class RegistrationController implements BaseController{

	@RequestMapping(value = "/registration", method = RequestMethod.GET )
	public String registrationPage(){
		return "registration";
	}
}
