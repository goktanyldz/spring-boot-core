package com.goktan.springbootcore.dependencyinjection.consturactorinjection;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {
    @Override
    public String getTeacher() {
        return "I am Math Teacher";
    }
}
