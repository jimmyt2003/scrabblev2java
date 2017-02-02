package com.jamestaylor.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Player {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String telephone;

    @OneToMany(targetEntity = MatchPlayer.class, fetch = FetchType.EAGER)
    private List<MatchPlayer> matchPlayers;

    protected Player() {}

    public Player(String name, String telephone, List<MatchPlayer> matchPlayers) {
        this.name = name;
        this.telephone = telephone;
        this.matchPlayers = matchPlayers;
    }

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

    public List<MatchPlayer> getMatchPlayers() {
        return matchPlayers;
    }

    public void setMatchPlayers(List<MatchPlayer> matchPlayers) {
        this.matchPlayers = matchPlayers;
    }
}
