package com.jamestaylor.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "matches")
public class Match {

    @Id
    @GeneratedValue
    private Long id;
    private Date matchDate;
    private List<MatchPlayer> matchPlayers;

    protected Match() {}

    public Match(Date matchDate) {
        this.matchDate = matchDate;
    }

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
    public List<MatchPlayer> getMatchPlayers() {
        return matchPlayers;
    }

    public void setMatchPlayers(List<MatchPlayer> matchPlayers) {
        this.matchPlayers = matchPlayers;
    }

    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", matchDate=" + matchDate +
                ", matchPlayers=" + matchPlayers +
                '}';
    }
}
