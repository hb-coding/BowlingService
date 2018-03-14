package com.bowling.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    Long bowlerId;

    int gameNumber;

    @NotNull
    @OneToMany
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
}
