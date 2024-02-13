package com.nnpia.nnpia_cv1.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceClass implements GreetingService {
    @Override
    public String sayGreeting() {
        return "greeting";
    }
}