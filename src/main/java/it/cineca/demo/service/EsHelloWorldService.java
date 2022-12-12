package it.cineca.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class EsHelloWorldService implements HelloWorldService {

    @Override
    public String getLog() {
        return "Hola mundo";
    }
}
