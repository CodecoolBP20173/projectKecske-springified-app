package com.projectmanager.controller;

import com.projectmanager.model.TeamModel;
import com.projectmanager.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TeamController {

    @Autowired
    TeamService teamService;

    @GetMapping("/create_team")
    public String teamForm() {
        return "team_form";
    }

    @PostMapping("/create_team")
    public String addNewTeam(@ModelAttribute TeamModel teamModel) {
        teamService.addTeam(teamModel);
        return "redirect:/";
    }

}
