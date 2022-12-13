package it.cineca.springbootbeginner.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

	private static final String HELLO_WORLD = "Hello World!"; 
	
	@Override
	public String getLog() {
		return HELLO_WORLD;
	}

}
