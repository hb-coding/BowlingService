package com.bowling.DAO;

import com.bowling.Entity.Bowler;
import com.bowling.Service.BowlerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BowlerDAO {

    @Autowired
    BowlerRepository bowlerRepo;

    public Bowler saveBowler(Bowler newBowler){
        return bowlerRepo.save(newBowler);
    }
}
