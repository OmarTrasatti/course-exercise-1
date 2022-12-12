package it.cineca.demo.controller;

import it.cineca.demo.service.HelloWorldServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyBasedController {
    @Autowired private HelloWorldServiceImpl helloWorldService;

    public String getLog() {
        return helloWorldService.getLog();
    }
}
