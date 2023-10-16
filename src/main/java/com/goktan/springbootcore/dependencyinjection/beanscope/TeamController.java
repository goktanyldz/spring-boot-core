package com.goktan.springbootcore.dependencyinjection.beanscope;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/champion")
public class TeamController {
    private Team team;
    private Team championTeam;
    public TeamController(@Qualifier("fenerbahce") Team championTeam,@Qualifier("fenerbahce") Team team){
        this.championTeam = championTeam;
        this.team = team;
    }
    @GetMapping("/fenerbahce")
    public String  getInfoChampionTeam(){
         return championTeam.teamInfo();
    }
    // What is  a singleton ?
    // Spring Container creates only one instance of the bean by default
    // It is cached in memory
    // All dependency injection for the bean
    // will reference the SAME bean

    // SPRING BEAN SCOPES
    //SINGLETON - Create a single shared instance of the bean . by default
    //PROTOTYPE - Creates a new bean instance for each container request.
    //REQUEST - Scope to an HTTP web request .Only used for web aps.
    //SESSİON - Scope to an HTTP web session.Only used for web aps.
}
