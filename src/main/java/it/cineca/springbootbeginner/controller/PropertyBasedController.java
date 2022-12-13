package it.cineca.springbootbeginner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import it.cineca.springbootbeginner.service.HelloWorldServiceImpl;

@Controller
public class PropertyBasedController {

	@Autowired	
	HelloWorldServiceImpl service;

	public String getLog() {
		return service.getLog();
	}
	
}
