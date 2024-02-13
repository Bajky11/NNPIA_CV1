package com.nnpia.nnpia_cv1.controllers;

import com.nnpia.nnpia_cv1.services.GreetingServiceClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerDTest {
    ControllerD controller;

    @Test
    void sayHallo() {
        controller = new ControllerD();
        controller.greetingService = new GreetingServiceClass();
        System.out.println(controller.sayHallo());
    }

}