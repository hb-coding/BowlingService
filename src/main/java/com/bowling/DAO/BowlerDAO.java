package com.bowling.DAO;

import com.bowling.Entity.Bowler;
import com.bowling.Service.BowlerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BowlerDAO {

    @Autowired
    BowlerRepository bowlerRepo;

    public BowlerDAO(){

    }

    public BowlerDAO(BowlerRepository bowlerRepo) {
        this.bowlerRepo = bowlerRepo;
    }

    public Bowler saveBowler(Bowler newBowler){
        return bowlerRepo.save(newBowler);
    }
}
