package it.cineca.springbootbeginner.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import it.cineca.springbootbeginner.services.HelloWorldService;

@Controller
public class MyController {
	
	@Autowired
	@Qualifier("helloWorldServiceImpl")
	HelloWorldService myHelloWorldService;
	
	public String getLog() {
		return myHelloWorldService.getLog();
	}
}
