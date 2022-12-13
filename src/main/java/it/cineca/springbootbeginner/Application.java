package it.cineca.springbootbeginner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import it.cineca.springbootbeginner.controller.ConstructorBasedController;
import it.cineca.springbootbeginner.controller.MyController;
import it.cineca.springbootbeginner.controller.PropertyBasedController;
import it.cineca.springbootbeginner.controller.SetterBasedController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =  SpringApplication.run(Application.class, args);
		
		 PropertyBasedController propertyController = (PropertyBasedController) ctx.getBean(PropertyBasedController.class);
		 System.out.println(propertyController.getHelloWorld());
		 
		 ConstructorBasedController constructorController = (ConstructorBasedController) ctx.getBean(ConstructorBasedController.class);
		 System.out.println(constructorController.getHelloWorld());
		 
		 SetterBasedController setterBasedController = (SetterBasedController) ctx.getBean(SetterBasedController.class);
		 System.out.println(setterBasedController.getHelloWorld());
		 
		 MyController myController = (MyController) ctx.getBean(MyController.class);
		 System.out.println(myController.getHelloWorld());
	}

}
