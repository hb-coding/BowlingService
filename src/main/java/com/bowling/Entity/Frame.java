package com.bowling.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Frame {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    Long gameId;

    @NotNull
    int frameNumber;

    @NotNull
    int rollOne;

    int rollTwo;

    @NotNull
    FrameType frameType;

    public Frame() {
    }

    public Frame(Long id, int rollOne, int rollTwo, FrameType frameType, int frameNumber, Long gameId) {
        this.id = id;
        this.rollOne = rollOne;
        this.rollTwo = rollTwo;
        this.frameType = frameType;
        this.frameNumber = frameNumber;
        this.gameId = gameId;
    }

    public int getRollOne() {
        return rollOne;
    }

    public void setRollOne(int rollOne) {
        this.rollOne = rollOne;
    }

    public int getRollTwo() {
        return rollTwo;
    }

    public void setRollTwo(int rollTwo) {
        this.rollTwo = rollTwo;
    }

    public FrameType getFrameType() {
        return frameType;
    }

    public void setFrameType(FrameType frameType) {
        this.frameType = frameType;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public int getFrameNumber() {
        return frameNumber;
    }

    public void setFrameNumber(int frameNumber) {
        this.frameNumber = frameNumber;
    }
}
