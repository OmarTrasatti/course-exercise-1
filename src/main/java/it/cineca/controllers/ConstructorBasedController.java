package it.cineca.controllers;

import org.springframework.stereotype.Controller;
import it.cineca.services.HelloWorldService;

@Controller
public class ConstructorBasedController {

	HelloWorldService hwService;

	//Qui posso passare direttamente l'interfaccia perché Spring in automatico cerca un'implementazione
	public ConstructorBasedController(HelloWorldService hwService) {
		this.hwService = hwService;
	}
	
	public String getLog() {
		return hwService.getLog();
	}
	
}
