package com.jamestaylor.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class MatchPlayer implements Serializable {

    private Match match;
    private Player player;
    private Integer score;

    @Id
    @ManyToOne
    @JoinColumn(name = "match_id")
    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Player getPlayer() {
        return player;
    }

    @Id
    @ManyToOne
    @JoinColumn(name = "player_id")
    public void setPlayer(Player player) {
        this.player = player;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
