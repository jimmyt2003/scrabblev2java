package com.jamestaylor.Service;

import com.jamestaylor.Entity.Player;
import com.jamestaylor.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@EnableJpaRepositories
@Transactional
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public Iterable<Player> getAllPlayers(){
        return playerRepository.findAll();
    }

    public Player getPlayerById(Long id){
        return playerRepository.findOne(id);
    }

    public void save(Player player){

        playerRepository.save(player);
    }




}
