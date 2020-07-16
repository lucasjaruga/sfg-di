package pl.jarugalucas.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World of Spring!");

        return "Hi everybody!";
    }
}
