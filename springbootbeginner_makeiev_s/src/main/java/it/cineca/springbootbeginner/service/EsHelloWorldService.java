package it.cineca.springbootbeginner.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import it.cineca.springbootbeginner.interfaces.HelloWorldService;

@Service
@Profile("es")
@Primary
public class EsHelloWorldService implements HelloWorldService {
	
	@Override
	public String getLog() {
		return "Hola amigo";
	}
}