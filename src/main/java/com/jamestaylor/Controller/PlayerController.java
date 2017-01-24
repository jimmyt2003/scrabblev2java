package com.jamestaylor.Controller;

import com.jamestaylor.Entity.Player;
import com.jamestaylor.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.context.WebContext;

import java.util.Collection;

@Controller
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @GetMapping("/players")
    public ModelAndView allPlayers() {

        Iterable<Player> players = playerService.getAllPlayers();

        ModelAndView model = new ModelAndView("players");
        model.addObject("playerList", players);
        return model;
    }

    @RequestMapping(value = "/player/{id}", method = RequestMethod.GET)
    public ModelAndView getPlayerById(@PathVariable("id") Long id){

        ModelAndView model = new ModelAndView("profile");
        model.addObject("player", playerService.getPlayerById(id));
        return model;
    }

    @GetMapping("/add-player")
    public String addPlayer(Player player) {
        return "add-player";
    }

    @PostMapping("/add-player")
    public String addPlayerSubmit(@ModelAttribute Player player) {

        playerService.save(player);

        return "player-added";
    }
}
