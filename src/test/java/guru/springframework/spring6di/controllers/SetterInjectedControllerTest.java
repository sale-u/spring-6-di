package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {
    SetterInjectedController setterInjectedController;
    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();    // manually instantiating the class
        setterInjectedController.setGreetingService(new GreetingServiceImpl());    // manually setting the attribute of the class
    }
    @Test
    void sayHello() {
        System.out.println(setterInjectedController.sayHello());
    }
}