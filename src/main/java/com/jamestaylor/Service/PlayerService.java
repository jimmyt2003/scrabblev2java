package com.jamestaylor.Service;

import com.jamestaylor.Entity.Player;
import com.jamestaylor.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
@Transactional
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public Iterable<Player> getAllPlayers(){
        return playerRepository.findAll();
    }

    public Player getPlayerById(Long id){
        return playerRepository.findOne(id);
    }

    public void save(Player player){

        playerRepository.save(player);
    }

    @PersistenceContext
    private EntityManager em;

    public EntityManager getEntityManager() {
        return em;
    }


}
