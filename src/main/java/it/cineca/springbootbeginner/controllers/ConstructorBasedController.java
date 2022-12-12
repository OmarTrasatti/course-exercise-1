package it.cineca.springbootbeginner.controllers;

import org.springframework.stereotype.Controller;

import it.cineca.springbootbeginner.services.HelloWorldService;

@Controller
public class ConstructorBasedController {
	private HelloWorldService myService;
	
	public ConstructorBasedController (HelloWorldService myService) {
		this.myService = myService;
	}
	
	public String log() {
		return myService.getLog();
	}
}
