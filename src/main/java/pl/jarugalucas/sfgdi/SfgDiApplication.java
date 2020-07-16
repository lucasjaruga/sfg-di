package pl.jarugalucas.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.jarugalucas.sfgdi.controllers.ContructorInjectedController;
import pl.jarugalucas.sfgdi.controllers.MyController;
import pl.jarugalucas.sfgdi.controllers.PropertyInjectedController;
import pl.jarugalucas.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		// the run turns back an Application Context
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		// getBean uses lower case name, that's why myController instead MyController

		System.out.println("--------------- Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("--------------- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------------- Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("--------------- Constructor");

		ContructorInjectedController contructorInjectedController = (ContructorInjectedController) ctx.getBean("contructorInjectedController");
		System.out.println(contructorInjectedController.getGreeting());
	}
}