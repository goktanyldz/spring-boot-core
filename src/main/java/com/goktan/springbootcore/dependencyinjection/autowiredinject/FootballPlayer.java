package com.goktan.springbootcore.dependencyinjection.autowiredinject;


import org.springframework.stereotype.Component;

@Component
//@Component marks the class as a Spring Bean
//A Spring Bean just a regular Java class that is managed by Spring
//@Component also makes the bean available for dependency injection
public class FootballPlayer implements Player {
    @Override
    public String getPlayer() {
        return "I am Football Player";
    }
}
