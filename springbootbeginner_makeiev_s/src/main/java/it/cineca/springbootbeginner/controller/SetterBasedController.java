package it.cineca.springbootbeginner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import it.cineca.springbootbeginner.interfaces.HelloWorldService;

@Controller
public class SetterBasedController {
	
    private HelloWorldService helloWorldService;

    @Autowired
    private void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String getLog() {
        return helloWorldService.getLog();
    }
}
