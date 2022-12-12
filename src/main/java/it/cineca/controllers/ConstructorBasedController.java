package it.cineca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import it.cineca.services.HelloWorldService;

@Controller
public class ConstructorBasedController {
	
	@Autowired
	HelloWorldService hwService;
	
	

}
