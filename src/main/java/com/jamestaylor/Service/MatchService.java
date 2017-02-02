package com.jamestaylor.Service;

import com.jamestaylor.Entity.Match;
import com.jamestaylor.Repository.MatchRepository;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class MatchService {

    @Autowired
    MatchRepository matchRepository;

    public void save(Match match) {
        matchRepository.save(match);
    }

    public Iterable<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    public Match getMatchById(Long id) {
        return matchRepository.findOne(id);
    }
}
