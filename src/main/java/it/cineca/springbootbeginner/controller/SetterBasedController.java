package it.cineca.springbootbeginner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import it.cineca.springbootbeginner.service.HelloWorldService;

@Controller
public class SetterBasedController {
	
	
	private HelloWorldService helloWorldService;
	
	@Autowired
	private void setHelloWorldService(HelloWorldService svc) {
		System.out.println("Sono nel setter di HelloWorldService all'interno di SetterBasedController");
		this.helloWorldService=svc;
	}
	
	public String getLog() {
		return helloWorldService.getLog();
	}
	
}
