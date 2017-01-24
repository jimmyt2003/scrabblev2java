package com.jamestaylor.Entity;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Player {

    private Long id;
    private String name;
    private String telephone;
    private Set<MatchPlayer> matchPlayers;

    protected Player() {}

    public Player(String name, String telephone) {
        this.name = name;
        this.telephone = telephone;
        matchPlayers = new HashSet<>();
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @OneToMany(mappedBy = "player")
    public Set<MatchPlayer> getMatchPlayers() {
        return matchPlayers;
    }

    public void setMatchPlayers(Set<MatchPlayer> matchPlayers) {
        this.matchPlayers = matchPlayers;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
