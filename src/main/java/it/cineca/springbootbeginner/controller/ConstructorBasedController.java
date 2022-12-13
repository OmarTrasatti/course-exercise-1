package it.cineca.springbootbeginner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import it.cineca.springbootbeginner.service.HelloWorldServiceImpl;

@Controller
public class ConstructorBasedController {
	
	@Autowired private HelloWorldServiceImpl helloWorldService;

	public ConstructorBasedController(HelloWorldServiceImpl helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	public String getHelloWorld() {
		return helloWorldService.getLog();
	}
	
}
