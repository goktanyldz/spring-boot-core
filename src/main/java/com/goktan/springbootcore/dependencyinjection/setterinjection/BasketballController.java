package com.goktan.springbootcore.dependencyinjection.setterinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/setter"))
public class BasketballController {
    private Coach myCoach;
    @Autowired
    public void setMyCoach(Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/basketballcoach")
    public String getInfoCoach(){
       return  myCoach.getCoach();
    }
    //Teacher theCoach = new BasketballCoach();
    //TeachersController appController = new TeachersController();
    // appController.setCoach(theCoach);

    //Setter Injection
    //Use this when you have optional dependencies
    // If dependency is not provided, your app can provide reasonable default logic

}
