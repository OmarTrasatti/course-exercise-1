package it.cineca.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("it") //Con profilo it (inserito in application.properties verrà preso questo Bean come primario)
@Primary
public class ItHelloWorldService implements HelloWorldService{

	@Override
	public String getLog() {
		return "Ciao Mondo!";
	}

	
}
