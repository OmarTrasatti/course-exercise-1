package it.cineca.springbootbeginner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import it.cineca.springbootbeginner.services.HelloWorldService;

@Controller
public class PropertyBasedController {
	@Autowired
	private HelloWorldService myHelloWorldService;
	
	public String getLog() {
		return myHelloWorldService.getLog();
	}
}
