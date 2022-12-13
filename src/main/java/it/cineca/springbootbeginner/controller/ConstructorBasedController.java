package it.cineca.springbootbeginner.controller;

import org.springframework.stereotype.Controller;

import it.cineca.springbootbeginner.service.HelloWorldServiceImpl;

@Controller
public class ConstructorBasedController {
	
	private HelloWorldServiceImpl service;
	
	public ConstructorBasedController(HelloWorldServiceImpl service) {
		this.service = service;
	}
	
	public String getLog() {
		return service.getLog();
	}
}
