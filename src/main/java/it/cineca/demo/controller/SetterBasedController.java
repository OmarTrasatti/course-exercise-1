package it.cineca.demo.controller;

import it.cineca.demo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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
