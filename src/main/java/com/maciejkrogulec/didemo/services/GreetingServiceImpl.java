package com.maciejkrogulec.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Spring!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
