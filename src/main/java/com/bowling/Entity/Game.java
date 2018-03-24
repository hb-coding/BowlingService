package com.bowling.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Game {

    @Id
    Long id;

    Long bowlerId;

    int gameNumber;

    //@NotNull
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="gameId")
    List<Frame> frames;

    @NotNull
    int score;


    public Game() {

    }

    public Game(Long id, Long bowlerId, List<Frame> frames) {
        this.id = id;
        this.bowlerId = bowlerId;
        this.frames = frames;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBowlerId() {
        return bowlerId;
    }

    public void setBowlerId(Long bowlerId) {
        this.bowlerId = bowlerId;
    }

    public List<Frame> getFrames() {
        return frames;
    }

    public void setFrames(List<Frame> frames) {
        this.frames = frames;
    }

    public int getGameNumber() {
        return gameNumber;
    }

    public void setGameNumber(int gameNumber) {
        this.gameNumber = gameNumber;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
