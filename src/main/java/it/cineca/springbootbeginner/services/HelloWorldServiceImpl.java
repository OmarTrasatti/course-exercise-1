package it.cineca.springbootbeginner.services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {
	public String getLog() {
		return "Hello world!";
	}
}
