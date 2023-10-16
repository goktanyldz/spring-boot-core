package com.goktan.springbootcore.dependencyinjection.beanscope;

import org.springframework.stereotype.Component;

@Component
public class Fenerbahce implements Team{

    @Override
    public String teamInfo() {
        return "Champion Fenerbahce";
    }
}
