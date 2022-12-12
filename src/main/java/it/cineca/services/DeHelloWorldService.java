package it.cineca.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("de") //Con profilo de (inserito in application.properties verrà preso questo Bean come primario)
@Primary
public class DeHelloWorldService implements HelloWorldService{

	@Override
	public String getLog() {
		return "Hallo Welt!";
	}

	
}
