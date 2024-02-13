package com.nnpia.nnpia_cv1.controllers;

import com.nnpia.nnpia_cv1.services.GreetingServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerC {

    @Autowired
    private GreetingServiceClass greetingService;

    public void setGreetingService(GreetingServiceClass greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHallo() {
        return greetingService.sayGreeting();
    }
}
