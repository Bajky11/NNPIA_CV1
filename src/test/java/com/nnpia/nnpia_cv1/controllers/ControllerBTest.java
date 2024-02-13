package com.nnpia.nnpia_cv1.controllers;

import com.nnpia.nnpia_cv1.services.GreetingServiceClass;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ControllerBTest {
    @Autowired
    ControllerB controller;

    @Test
    void sayHallo() {
        //controller = new ControllerB(new GreetingServiceClass());
        System.out.println(controller.sayHallo());
    }

}