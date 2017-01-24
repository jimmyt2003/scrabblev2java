package com.jamestaylor.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Match {

    private Long id;
    private Date matchDate;
    private Set<MatchPlayer> matchPlayers;

    protected Match() {}

    public Match(Date matchDate) {
        this.matchDate = matchDate;
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

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    @OneToMany(mappedBy = "match")
    public Set<MatchPlayer> getMatchPlayers() {
        return matchPlayers;
    }

    public void setMatchPlayers(Set<MatchPlayer> matchPlayers) {
        this.matchPlayers = matchPlayers;
    }
}
