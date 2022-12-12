package it.cineca.springbootbeginner.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import it.cineca.springbootbeginner.services.HelloWorldService;

@Controller
public class PropertyBasedController {
	
	public PropertyBasedController() {}
	
	@Autowired
	private HelloWorldService myService;
	
	public String log() {
		return myService.getLog();
	}
 
}
