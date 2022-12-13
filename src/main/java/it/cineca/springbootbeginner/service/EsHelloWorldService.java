package it.cineca.springbootbeginner.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class EsHelloWorldService implements HelloWorldService{

	public String getLog() {
		return "Hola Mundo!";
	}

	
}