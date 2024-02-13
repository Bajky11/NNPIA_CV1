package com.nnpia.nnpia_cv1.controllers;

import com.nnpia.nnpia_cv1.services.GreetingServiceClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerCTest {
    ControllerC controller;

    @Test
    void sayHallo() {
        controller = new ControllerC();
        controller.setGreetingService(new GreetingServiceClass());
        System.out.println(controller.sayHallo());
    }

}