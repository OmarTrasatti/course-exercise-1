package it.cineca.springbootbeginner.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import it.cineca.springbootbeginner.interfaces.HelloWorldService;

@Service
@Profile("it")
@Primary
public class ItHelloWorldService implements HelloWorldService {

	public String getLog() {
		
		return "Ciao mondo!";
	}

}
