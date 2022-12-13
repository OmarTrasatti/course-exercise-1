package it.cineca.springbootbeginner.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import it.cineca.springbootbeginner.services.HelloWorldService;

@Controller
public class SetterBasedController {

	private HelloWorldService myHelloWorldService;
	
	@Autowired
	public void setHelloWorldService(HelloWorldService service) {
		this.myHelloWorldService = service;
		
	}
	
	public String getLog() {
		return myHelloWorldService.getLog();
	}
}
