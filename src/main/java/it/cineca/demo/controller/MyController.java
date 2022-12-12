package it.cineca.demo.controller;

import it.cineca.demo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    @Autowired
    @Qualifier("helloWorldServiceImpl")
    HelloWorldService helloWorldService;

    public String getLog() {
        return helloWorldService.getLog();
    }
}
