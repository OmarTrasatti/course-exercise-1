package it.cineca.springbootbeginner.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary
@Service
@Profile("es")
public class EsHelloWordService implements HelloWorldService{

	@Override
	public String getLog() {
		return "Hola Mundo";
	}

}
