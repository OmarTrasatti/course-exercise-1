package it.cineca.springbootbeginner.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// se non specifico il profile è il default
@Service
public class HelloWorldServiceImpl implements HelloWorldService{
	public String getLog() {
		return "Hello world";
	}
}
