package it.cineca.springbootbeginner.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary
@Service
@Profile("es")
public class EsHelloWorldService implements HelloWorldService {
	
	public String getLog() {
		return "Hola mundo!";
	}
}

