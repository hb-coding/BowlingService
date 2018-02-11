package com.bowling.Entity;

public class Bowler {
    private int id;
    private String name;
    private Game[] games;

    public Bowler(int id, String name, Game[] games){
        this.id = id;
        this.name = name;
        this.games = games;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Game[] getGames() {
        return games;
    }

    public void setGames(Game[] games) {
        this.games = games;
    }
}
