package com.goktan.springbootcore.dependencyinjection.setterinjection;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{

    @Override
    public String getCoach() {
        return "I am basketball coach";
    }
}
