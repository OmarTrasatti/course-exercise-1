package it.cineca.springbootbeginner.controller;

import org.springframework.stereotype.Controller;

import it.cineca.springbootbeginner.interfaces.HelloWorldService;

@Controller
public class ConstructorBasedController {
	
    private HelloWorldService helloWorldService;

    public ConstructorBasedController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String getLog() {
        return helloWorldService.getLog();
    }
}