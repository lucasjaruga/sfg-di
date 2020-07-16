package pl.jarugalucas.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import pl.jarugalucas.sfgdi.services.GreetingService;

@Controller
public class ContructorInjectedController {

    private final GreetingService greetingService;

    public ContructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
