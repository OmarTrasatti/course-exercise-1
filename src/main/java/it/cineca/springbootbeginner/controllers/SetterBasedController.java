package it.cineca.springbootbeginner.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import it.cineca.springbootbeginner.services.HelloWorldService;

@Controller
public class SetterBasedController {

	private HelloWorldService myService;
	
	@Autowired
	public void setHelloWorldService(HelloWorldService myService) {
		this.myService = myService;
	}
	
	public String log() {
		return myService.getLog();
	}
	
}
