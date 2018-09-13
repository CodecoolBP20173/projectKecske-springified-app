package com.projectmanager.controller;

import com.projectmanager.model.UserModel;
import com.projectmanager.repository.ProjectRepository;
import com.projectmanager.repository.TeamRepository;
import com.projectmanager.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @Autowired
    HttpSession session;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping("/")
    public String listUsers(Model model) {
        UserModel user = (UserModel) session.getAttribute("user");
        if (user != null) {
            model.addAttribute("users", userRepository.findAll());
            model.addAttribute("teams", teamRepository.findAllByTeamLeader(user));
            model.addAttribute("projects", projectRepository.findAll());
        }
        return "index";
    }
}
