package com.bowling.Controller;


import com.bowling.DAO.BowlerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bowling.Entity.Bowler;

import java.util.List;

@Controller
@RequestMapping(path="/bowling")
public class BowlingController {

    @Autowired
    BowlerDAO bowlerDAO;

//    @GetMapping("bowlers")
//    public List<Bowler> getBowlers{
//
//    }

    //TODO: Add return statement

    @PutMapping("bowler")
    public ResponseEntity<Bowler> addBowler(@RequestBody Bowler newBowler){
        bowlerDAO.saveBowler(newBowler);
    }



}
