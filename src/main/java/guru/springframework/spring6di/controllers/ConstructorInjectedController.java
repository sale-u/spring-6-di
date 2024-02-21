package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;

public class ConstructorInjectedController {

    GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
