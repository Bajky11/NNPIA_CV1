package com.nnpia.nnpia_cv1.controllers;

import com.nnpia.nnpia_cv1.services.GreetingServiceClass;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerB {
    private final GreetingServiceClass greetingService;

    public ControllerB(GreetingServiceClass greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHallo() {
        return greetingService.sayGreeting();
    }
}
