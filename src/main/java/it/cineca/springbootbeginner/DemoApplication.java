package it.cineca.springbootbeginner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import it.cineca.springbootbeginner.controller.ConstructorBasedController;
import it.cineca.springbootbeginner.controller.MyController;
import it.cineca.springbootbeginner.controller.PropertyBasedController;
import it.cineca.springbootbeginner.controller.SetterBasedController;

@SpringBootApplication
//@ComponentScan({"it.cineca.controller", "it.cineca.service"})
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		
		PropertyBasedController propertyBasedController = (PropertyBasedController) ctx.getBean(PropertyBasedController.class);
		System.out.println("propertyBasedController: " + propertyBasedController.getLog());
		
		SetterBasedController setterBasedController = (SetterBasedController) ctx.getBean(SetterBasedController.class);
		System.out.println("setterBasedController: " + setterBasedController.getLog());
		
		ConstructorBasedController constructorBasedController = (ConstructorBasedController) ctx.getBean(ConstructorBasedController.class);
		System.out.println("constructorBasedController: " + constructorBasedController.getLog());
		
		MyController myController = (MyController) ctx.getBean(MyController.class);
		System.out.println("myController: " + myController.getLog());
		
	}
}
