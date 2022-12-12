package it.cineca.springbootbeginner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import it.cineca.springbootbeginner.service.HelloWorldService;

@Controller
public class PropertyBasedController {
	
	@Autowired
	private HelloWorldService helloWorldService;
	
	
	public String getLog() {
		return helloWorldService.getLog();
	}
	
}
