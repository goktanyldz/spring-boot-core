package com.goktan.springbootcore.dependencyinjection.autowiredinject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/player")
public class AppController {
    @Autowired
    FootballPlayer footballPlayer;
    @GetMapping("/footballplayer")
    public String getInfoPlayer(){
        return footballPlayer.getPlayer();
    }
}
