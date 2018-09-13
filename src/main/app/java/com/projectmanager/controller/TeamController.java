package com.projectmanager.controller;

import com.projectmanager.model.TeamModel;
import com.projectmanager.model.UserModel;
import com.projectmanager.repository.UserRepository;
import com.projectmanager.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class TeamController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    HttpSession session;

    @Autowired
    TeamService teamService;

    @GetMapping("/create_team")
    public String teamForm() {
        return "team_form";
    }

    @PostMapping("/create_team")
    public String addNewTeam(@ModelAttribute TeamModel teamModel) {
        UserModel user = (UserModel) session.getAttribute("user");
        teamModel.setTeamLeader(user);
        teamService.addTeam(teamModel);

        return "redirect:/";
    }

}
