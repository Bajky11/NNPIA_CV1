package com.nnpia.nnpia_cv1.controllers;

import com.nnpia.nnpia_cv1.services.GreetingService;
import com.nnpia.nnpia_cv1.services.GreetingServiceClass;

public class ControllerA {
    private final GreetingService greetingService;

    public ControllerA() {
        this.greetingService = new GreetingServiceClass();
    }

    public String sayHallo() {
        return greetingService.sayGreeting();
    }
}