package com.goktan.springbootcore.dependencyinjection.beanlifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeCycle implements Car {


    public BeanLifeCycle(){
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());
    }

    @Override
    public void carInfo() {
    }
    //You can add custom code during bean initialization
    //calling custom business logic methods
    //setting up handles to resources(db,sockets,file ,etc)
    //you can add custom code during bean destruction
    //calling custom business logic method
    //clean up handles to resources
}
