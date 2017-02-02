package com.jamestaylor.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class MatchPlayer implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(targetEntity = Match.class, fetch = FetchType.EAGER)
//    @JoinColumn(name = "match_id")
    private Match match;

    @ManyToOne(targetEntity = Player.class, fetch = FetchType.EAGER)
//    @JoinColumn(name = "player_id")
    private Player player;
    private Integer score;

    protected MatchPlayer() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Match getMatch() {
        return match;
    }


    public void setMatch(Match match) {
        this.match = match;
    }

    public Player getPlayer() {
        return player;
    }

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
