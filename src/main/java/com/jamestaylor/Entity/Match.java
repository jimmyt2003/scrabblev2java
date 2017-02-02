package com.jamestaylor.Entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "matches")
public class Match {

    @Id
    @GeneratedValue
    private Long id;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date matchDate;

    @OneToMany(targetEntity = MatchPlayer.class, fetch = FetchType.EAGER)
    private List<MatchPlayer> matchPlayers;

    protected Match() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public List<MatchPlayer> getMatchPlayers() {
        return matchPlayers;
    }

    public void setMatchPlayers(List<MatchPlayer> matchPlayers) {
        this.matchPlayers = matchPlayers;
    }
}
