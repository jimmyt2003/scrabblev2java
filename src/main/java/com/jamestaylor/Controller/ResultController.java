package com.jamestaylor.Controller;

import com.jamestaylor.Entity.Match;
import com.jamestaylor.Entity.MatchPlayer;
import com.jamestaylor.Entity.Player;
import com.jamestaylor.Service.MatchPlayerService;
import com.jamestaylor.Service.MatchService;
import com.jamestaylor.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResultController {

    @Autowired
    private PlayerService playerService;

    @Autowired
    private MatchService matchService;

    @Autowired
    private MatchPlayerService matchPlayerService;

    @GetMapping("/add-result/{id}")
    public ModelAndView addResult(Player player, @PathVariable("id") Long id){

        Iterable<Player> players = playerService.getAllPlayers();

        ModelAndView model = new ModelAndView("add-result");

        model.addObject("match", matchService.getMatchById(id));
        model.addObject("playerList", players);
//        model.addObject("matchPlayer", matchPlayer);

        return model;
    }

    @PostMapping("/add-result/{id}")
    public String addResultSubmit(@PathVariable("id") Long matchId, @ModelAttribute MatchPlayer matchPlayer, @ModelAttribute Player player) {

        System.out.println(matchPlayer);

        Match match = matchService.getMatchById(matchId);
//        Player player = playerService.getPlayerById(player.getId());

        System.out.println(match);
        System.out.println(player);

        matchPlayer.setMatch(match);
        matchPlayer.setPlayer(player);
        //matchPlayer.setScore(matchPlayer.getScore());

        matchPlayerService.save(matchPlayer);

        return "match-added";
    }

    @GetMapping("/results")
    public ModelAndView allResults() {

        Iterable<MatchPlayer> results = matchPlayerService.getAllResults();

        ModelAndView model = new ModelAndView("results");
        model.addObject("results", results);
        return model;
    }
}
