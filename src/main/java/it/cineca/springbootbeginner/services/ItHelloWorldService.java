package it.cineca.springbootbeginner.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary
@Service
@Profile("it")
public class ItHelloWorldService implements HelloWorldService {
	
	public String getLog() {
		return "Ciao mondo!";
	}
}
