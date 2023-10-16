package com.goktan.springbootcore.dependencyinjection.beanscope;

import org.springframework.stereotype.Component;

@Component
public class Galatasaray implements Team{
    @Override
    public String teamInfo() {
        return "Champion Galatasaray";
    }
}
