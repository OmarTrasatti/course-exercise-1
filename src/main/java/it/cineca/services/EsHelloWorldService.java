package it.cineca.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es") //Con profilo es (inserito in application.properties verrà preso questo Bean come primario)
@Primary
public class EsHelloWorldService implements HelloWorldService{

	@Override
	public String getLog() {
		return "Hola Mundo!";
	}

	
}
