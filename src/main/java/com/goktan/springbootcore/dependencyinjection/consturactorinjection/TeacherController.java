package com.goktan.springbootcore.dependencyinjection.consturactorinjection;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    //Why Constructor Injection ?
    //Testability - The Constructor Injection prevents to NullPointerExpection in tests.
    //Safety - Forces Spring to provide mandatory dependencies
    MathTeacher mathTeacher;
    protected TeacherController(MathTeacher mathTeacher){
        this.mathTeacher = mathTeacher;
    }
    @GetMapping("/mathteacher")
    public String getInfoPlayer(){
        return mathTeacher.getTeacher();
    }

}
