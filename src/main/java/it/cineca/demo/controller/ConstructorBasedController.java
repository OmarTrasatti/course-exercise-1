package it.cineca.demo.controller;

import it.cineca.demo.service.HelloWorldService;
import org.springframework.stereotype.Controller;

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
