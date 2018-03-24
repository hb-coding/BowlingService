package com.bowling.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Bowler {

    @Id
    private Long id;

    @NotNull
    private String lastName;

    @NotNull
    private String firstName;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "bowlerId")
    public List<Game> games;

    public Bowler() {

    }

    public Bowler(Long id, String firstName, String lastName, List<Game> games){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.games = games;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
