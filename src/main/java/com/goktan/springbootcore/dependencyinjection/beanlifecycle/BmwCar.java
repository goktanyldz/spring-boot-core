package com.goktan.springbootcore.dependencyinjection.beanlifecycle;

public class BmwCar implements Car{
    @Override
    public void carInfo() {
        System.out.println("ın  carInfo() of BmwCar class");
    }
}
