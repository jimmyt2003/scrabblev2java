package com.jamestaylor.Controller;

import com.jamestaylor.Entity.Match;
import com.jamestaylor.Entity.Player;
import com.jamestaylor.Service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class MatchController {

    @Autowired
    MatchService matchService;

    @GetMapping("/matches")
    public ModelAndView allMatches() {

        Iterable<Match> matches = matchService.getAllMatches();

        ModelAndView model = new ModelAndView("matches");
        model.addObject("matchList", matches);
        return model;
    }

    @GetMapping("/add-match")
    public String addMatch(Match match) {
        return "add-match";
    }

    @PostMapping("/add-match")
    public String addMatchSubmit(@ModelAttribute Match match) {

        matchService.save(match);

        return "match-added";
    }

}
