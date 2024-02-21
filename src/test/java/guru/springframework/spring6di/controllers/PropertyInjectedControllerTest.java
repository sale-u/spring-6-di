package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {
    PropertyInjectedController propertyInjectedController;
    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();      // manually instantiating the class
        propertyInjectedController.greetingService = new GreetingServiceImpl();   // manually instantiating the attribute of the class
    }
    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}