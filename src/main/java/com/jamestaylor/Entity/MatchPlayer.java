package com.jamestaylor.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "match_player")
public class MatchPlayer implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private Match match;
    private Player player;
    private Integer score;

    protected MatchPlayer() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @ManyToOne
    @JoinColumn(name = "match.id")
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
    @JoinColumn(name = "player.id")
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
