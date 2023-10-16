package com.goktan.springbootcore.dependencyinjection.qualifierprimarylazy;

import org.springframework.stereotype.Component;

@Component
public class TurkishTeacher implements Teacher {

    @Override
    public String getTeacherInfo() {
        return "I am Turkish Teacher";
    }
}
