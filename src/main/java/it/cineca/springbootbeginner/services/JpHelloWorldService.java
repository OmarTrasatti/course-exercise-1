package it.cineca.springbootbeginner.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary
@Service
@Profile("jp")
public class JpHelloWorldService implements HelloWorldService {
	
	public String getLog() {
		return "こんにちは世界!";
	}
}

