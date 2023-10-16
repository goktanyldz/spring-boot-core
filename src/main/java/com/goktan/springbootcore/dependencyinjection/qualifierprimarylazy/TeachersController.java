package com.goktan.springbootcore.dependencyinjection.qualifierprimarylazy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/qualifier"))
public class TeachersController {
    private Teacher teacher;
    public TeachersController(@Qualifier("turkishTeacher") Teacher teacher){
        this.teacher = teacher;
    }
    @GetMapping("/teacher")
    public String getInfoTeacher(){
        return teacher.getTeacherInfo();
    }
    // we can use @primary in implementation class but when using @primary , can have only one for multiple implementations
    // ıf you mark multiple class with @primary , we have a problem , we cant use @primary more than one .
}   // which one : primary or qualifier ?
    // In  general, I recommend using @Qualifier , more specific , higher priority
    // Advantages of @lazy : only create objects as needed
//