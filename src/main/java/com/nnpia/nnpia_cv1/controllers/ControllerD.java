package com.nnpia.nnpia_cv1.controllers;

import com.nnpia.nnpia_cv1.services.GreetingServiceClass;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerD {
    GreetingServiceClass greetingService;

    public String sayHallo() {
        return greetingService.sayGreeting();
    }
}
