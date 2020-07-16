package pl.jarugalucas.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.jarugalucas.sfgdi.controllers.MyController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		// the run turns back an Application Context
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		// getBean uses lower case name, that's why myController instead MyController

		String greeting = myController.sayHello();
		System.out.println(greeting);
	}
}