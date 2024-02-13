package com.nnpia.nnpia_cv1.controllers;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ControllerATest {

    @Autowired
    ControllerA controller;

    @Test
    void sayHallo() {
        //controller = new ControllerA();
        System.out.println(controller.sayHallo());
    }

}