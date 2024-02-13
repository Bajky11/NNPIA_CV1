package com.nnpia.nnpia_cv1.controllers;

import com.nnpia.nnpia_cv1.services.GreetingServiceClass;

public class ControllerC {
    private GreetingServiceClass greetingService;

    public void setGreetingService(GreetingServiceClass greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHallo() {
        return greetingService.sayGreeting();
    }
}
