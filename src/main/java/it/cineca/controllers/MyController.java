package it.cineca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import it.cineca.services.HelloWorldService;

@Controller
public class MyController {
	
	@Autowired
	@Qualifier("helloWorldServiceImpl")
	HelloWorldService hwService;
	
	public String getLog() {
		return hwService.getLog();
	}
	
}
