package com.jamestaylor.Controller;

import com.jamestaylor.Entity.Player;
import com.jamestaylor.Service.MatchService;
import com.jamestaylor.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MatchController {

    @Autowired
    PlayerService playerService;

    @Autowired
    MatchService matchService;

    @GetMapping("/add-match")
    public ModelAndView addMatch(){
        Iterable<Player> players = playerService.getAllPlayers();

        ModelAndView model = new ModelAndView("add-match");
        model.addObject("playerList", players);
        return model;
    }
}
