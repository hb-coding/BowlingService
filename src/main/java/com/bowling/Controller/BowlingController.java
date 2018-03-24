package com.bowling.Controller;


import com.bowling.DAO.BowlerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.bowling.Entity.Bowler;

import java.util.List;


@RestController
@RequestMapping(path="/bowling")
public class BowlingController {

    @Autowired
    BowlerDAO bowlerDAO;

    @GetMapping("/health")
    public String getHealth(){
        return "Healthy";
    }

    //TODO: Change to ResponseEntity
    @PostMapping("/bowler")
    public Bowler addBowler(@RequestBody Bowler newBowler){
        return bowlerDAO.saveBowler(newBowler);
    }



}
