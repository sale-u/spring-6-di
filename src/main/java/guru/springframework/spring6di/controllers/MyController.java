package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    @Autowired
    private GreetingService greetingService;

    public String sayHello() {
        System.out.println("I'm in the controller");
        return greetingService.sayGreeting();
    }
}
