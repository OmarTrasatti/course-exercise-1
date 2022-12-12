package it.cineca.springbootbeginner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import it.cineca.springbootbeginner.controllers.ConstructorBasedController;
import it.cineca.springbootbeginner.controllers.MyController;
import it.cineca.springbootbeginner.controllers.PropertyBasedController;
import it.cineca.springbootbeginner.controllers.SetterBasedController;

@SpringBootApplication
public class DemoDiApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx =SpringApplication.run(DemoDiApplication.class, args);

		ConstructorBasedController cbController = (ConstructorBasedController) ctx.getBean("constructorBasedController");
		System.out.println("Constructor based: " + cbController.log());
		
		SetterBasedController sbController = (SetterBasedController) ctx.getBean("setterBasedController");
		System.out.println("Setter based: " + sbController.log());
		
		PropertyBasedController pbController = (PropertyBasedController) ctx.getBean("propertyBasedController");
		System.out.println("Property based: " + pbController.log());
		
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("My Controller: " + myController.log());
		
	}

}
