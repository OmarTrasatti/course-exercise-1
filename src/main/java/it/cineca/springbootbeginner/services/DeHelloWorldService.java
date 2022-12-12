package it.cineca.springbootbeginner.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
@Qualifier("DeHelloWorldService")
public class DeHelloWorldService implements HelloWorldService{
	
	@Override
	public String getLog() {
		return "Hallo Welt";
	}

}
