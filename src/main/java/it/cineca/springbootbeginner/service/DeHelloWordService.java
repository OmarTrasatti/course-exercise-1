package it.cineca.springbootbeginner.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary
@Service
@Profile("de")
public class DeHelloWordService implements HelloWorldService{

	@Override
	public String getLog() {
		return "Hallo Welt";
	}

}
