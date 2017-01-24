package com.jamestaylor.Dao;

import com.jamestaylor.Entity.Player;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class PlayerDao {

    private static Map<Integer, Player> players;

    static {

        players = new HashMap<Integer, Player>() {

            {

//                put(1, new Player("James","345553453"));
//                put(2, new Player("Tom","34534"));

            }
        };

    }

    public Collection<Player> getAllPlayers(){
        return players.values();
    }

    public void addPlayer(Player player) {

        players.put(null, player);

    }

    public Player getPlayerById(int id){
        return players.get(id);
    }


}
