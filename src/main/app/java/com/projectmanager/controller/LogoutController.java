package com.projectmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LogoutController {

    @Autowired
    HttpSession session;

    @GetMapping("/logout")
    public String logout() {
        session.removeAttribute("user");
        session.invalidate();
        return "redirect:/";
    }

}
