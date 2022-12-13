package it.cineca.springbootbeginner.service;

import it.cineca.springbootbeginner.interfaces.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {

	public String getLog() {
		
		return "Hello World ";
	}

}
