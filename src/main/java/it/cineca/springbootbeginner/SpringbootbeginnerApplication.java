package it.cineca.springbootbeginner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import it.cineca.springbootbeginner.controller.ConstructorBasedController;
import it.cineca.springbootbeginner.controller.MyController;
import it.cineca.springbootbeginner.controller.PropertyBasedController;
import it.cineca.springbootbeginner.controller.SetterBasedController;

@SpringBootApplication
public class SpringbootbeginnerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(SpringbootbeginnerApplication.class, args);
		
		
		SetterBasedController sbC = (SetterBasedController) ctx.getBean("setterBasedController");
		ConstructorBasedController cbC = (ConstructorBasedController) ctx.getBean("constructorBasedController");
		PropertyBasedController pbC = (PropertyBasedController) ctx.getBean("propertyBasedController");
		MyController myC=(MyController) ctx.getBean("myController");
		
		
		System.out.println(sbC.getLog());
		System.out.println(cbC.getLog());
		System.out.println(pbC.getLog());
		System.out.println(myC.getLog());
		
		
	}

}
