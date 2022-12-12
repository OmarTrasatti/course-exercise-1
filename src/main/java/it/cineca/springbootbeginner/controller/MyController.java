package it.cineca.springbootbeginner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import it.cineca.springbootbeginner.service.HelloWorldService;

@Controller
public class MyController {

	@Autowired
	@Qualifier("helloWorldServiceImpl")
	HelloWorldService hwService;
	
	
	public String getLog() {
		return hwService.getLog();
	}
}
