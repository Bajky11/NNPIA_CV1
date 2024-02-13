package com.nnpia.nnpia_cv1.controllers;

import com.nnpia.nnpia_cv1.services.GreetingService;
import com.nnpia.nnpia_cv1.services.GreetingServiceClass;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerA {
    private final GreetingService greetingService;

    public ControllerA() {
        this.greetingService = new GreetingServiceClass();
    }

    public String sayHallo() {
        return greetingService.sayGreeting();
    }
}