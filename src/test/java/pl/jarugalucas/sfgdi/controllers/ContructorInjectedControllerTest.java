package pl.jarugalucas.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.jarugalucas.sfgdi.services.GreetingServiceImpl;

class ContructorInjectedControllerTest {

    ContructorInjectedController controller;

    @BeforeEach
    void setUp() {
        // instantiation of object
        controller = new ContructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}