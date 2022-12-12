package it.cineca.springbootbeginner.controller;

import org.springframework.stereotype.Controller;

import it.cineca.springbootbeginner.service.HelloWorldService;

@Controller
public class ConstructorBasedController {
	
	
	private HelloWorldService helloWorldService;
	
	public  ConstructorBasedController(HelloWorldService svc) {
		this.helloWorldService=svc;
		System.out.println("Sono nel costruttore di ConstructorBasedController");
		
	}
	
	public String getLog() {
		return helloWorldService.getLog();
	}
}
