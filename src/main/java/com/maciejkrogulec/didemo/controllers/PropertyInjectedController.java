package com.maciejkrogulec.didemo.controllers;

import com.maciejkrogulec.didemo.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

}
