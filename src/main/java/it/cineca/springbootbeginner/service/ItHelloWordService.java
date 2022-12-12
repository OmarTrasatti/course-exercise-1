package it.cineca.springbootbeginner.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary
@Service
@Profile("it")
public class ItHelloWordService implements HelloWorldService{

	@Override
	public String getLog() {
		return "Ciao mondo";
	}

}
