package it.cineca.springbootbeginner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.AbstractEnvironment;

import it.cineca.springbootbeginner.controllers.ConstructorBasedController;
import it.cineca.springbootbeginner.controllers.PropertyBasedController;
import it.cineca.springbootbeginner.controllers.SetterBasedController;

@SpringBootApplication
public class Esercitazione1Application {

	public static void main(String[] args) {
		//SpringApplication.run(Esercitazione1Application.class, args);
		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "it");
	      
		ConfigurableApplicationContext ctx = SpringApplication.run(Esercitazione1Application.class, args);
		
		ConstructorBasedController cBc = (ConstructorBasedController) ctx.getBean("constructorBasedController");
		System.out.println("ConstructorBasedController: " + cBc.getLog());
		
		SetterBasedController sBc = (SetterBasedController) ctx.getBean("setterBasedController");
		System.out.println("SetterBasedController: " + sBc.getLog());
		
		PropertyBasedController pBc = (PropertyBasedController) ctx.getBean("propertyBasedController");
		System.out.println("PropertyBasedController: " + pBc.getLog());
		
	}

}
