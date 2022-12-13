package it.cineca.springbootbeginner.controllers;

import org.springframework.stereotype.Controller;

import it.cineca.springbootbeginner.services.HelloWorldService;

@Controller
public class ConstructorBasedController {

	private HelloWorldService myHelloWorldService;
	
	public ConstructorBasedController(HelloWorldService service) {
		this.myHelloWorldService = service;
		System.out.println("ConstructorBasedController type");
	}
	
	public String getLog() {
		return myHelloWorldService.getLog();
	}
}
