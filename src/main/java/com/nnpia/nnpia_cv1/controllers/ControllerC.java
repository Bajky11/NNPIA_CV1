package com.nnpia.nnpia_cv1.controllers;

import com.nnpia.nnpia_cv1.services.GreetingServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerC {

    private GreetingServiceClass greetingService;

    @Autowired
    public void setGreetingService(GreetingServiceClass greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHallo() {
        System.out.println("TEST VYPISU");
        return greetingService.sayGreeting();
    }
}
