package com.goktan.springbootcore.dependencyinjection.beanlifecycle;

public class MercedesCar implements Car{
    @Override
    public void carInfo() {
        System.out.println("ın  carInfo() of MercedesCar class");
    }
}
