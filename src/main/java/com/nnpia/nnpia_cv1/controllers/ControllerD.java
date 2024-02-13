package com.nnpia.nnpia_cv1.controllers;

import com.nnpia.nnpia_cv1.services.GreetingServiceClass;

public class ControllerD {
    GreetingServiceClass greetingService;

    public String sayHallo() {
        return greetingService.sayGreeting();
    }
}
