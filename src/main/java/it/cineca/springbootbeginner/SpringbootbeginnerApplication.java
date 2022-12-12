package it.cineca.springbootbeginner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import it.cineca.controllers.ConstructorBasedController;
import it.cineca.controllers.PropertyBasedController;
import it.cineca.controllers.SetterBasedController;

@SpringBootApplication
@ComponentScan("it.cineca.*")
public class SpringbootbeginnerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringbootbeginnerApplication.class, args);
		
		ConstructorBasedController cbCont = (ConstructorBasedController) ctx.getBean("constructorBasedController");
		System.out.println("Constructor based: " + cbCont.getLog());
		
		SetterBasedController sbCont = (SetterBasedController) ctx.getBean("setterBasedController");
		System.out.println("Setter based: " + sbCont.getLog());
		
		PropertyBasedController pbCont = (PropertyBasedController) ctx.getBean("propertyBasedController");
		System.out.print("Property based: " + pbCont.getLog());
	}

}
