package com.nnpia.nnpia_cv1.controllers;

import com.nnpia.nnpia_cv1.services.GreetingServiceClass;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import static org.junit.jupiter.api.Assertions.*;

class ControllerBTest {
    ControllerB controller;

    @Test
    void sayHallo() {
        controller = new ControllerB(new GreetingServiceClass());
        System.out.println(controller.sayHallo());
    }

}