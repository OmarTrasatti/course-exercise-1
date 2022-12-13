package it.cineca.springbootbeginner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import it.cineca.springbootbeginner.service.HelloWorldServiceImpl;

@Controller
public class SetterBasedController {
	
	private HelloWorldServiceImpl service;
	
	@Autowired
	public void setService(HelloWorldServiceImpl service) {
		this.service = service;
	}
	
	public String getLog() {
		return service.getLog();
	}
	
}
