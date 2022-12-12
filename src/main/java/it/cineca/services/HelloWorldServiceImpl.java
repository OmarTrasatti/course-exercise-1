package it.cineca.services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService{

	@Override
	public String getLog() {
		return "Hello World!";
	}

	
}
