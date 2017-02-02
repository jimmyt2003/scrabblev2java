package com.jamestaylor.Service;

import com.jamestaylor.Entity.MatchPlayer;
import com.jamestaylor.Entity.Player;
import com.jamestaylor.Repository.MatchPlayerRepository;
import com.jamestaylor.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@EnableJpaRepositories
@Transactional
public class MatchPlayerService {

    @Autowired
    private MatchPlayerRepository matchPlayerRepository;

    public void save(MatchPlayer matchPlayer){

        matchPlayerRepository.save(matchPlayer);
    }

    public Iterable<MatchPlayer> getAllResults(){
        return matchPlayerRepository.findAll();
    }




}
