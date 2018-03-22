package com.bowling.Service;

import com.bowling.Entity.Bowler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BowlerRepository extends JpaRepository<Bowler, Long> {


}
