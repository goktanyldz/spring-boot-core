package com.goktan.springbootcore.dependencyinjection.qualifierprimarylazy;

import org.springframework.stereotype.Component;

@Component
public class PhysicsTeacher implements Teacher{
    @Override
    public String getTeacherInfo() {
        return "I am Physics Teacher";
    }
}
