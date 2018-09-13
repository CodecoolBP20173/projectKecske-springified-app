package com.projectmanager.controller;

import com.projectmanager.model.UserModel;
import com.projectmanager.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {

    @Autowired
    RegistrationService registrationService;

    @PostMapping("/registration")
    public String registration(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("password") String password) {
        UserModel newUser = new UserModel();
        newUser.setName(name);
        newUser.setEmail(email);
        newUser.setHashedPassword(password);
        registrationService.registerUser(newUser);
        return "redirect:/";
    }

    @GetMapping("/registration")
    public String regGet(){
        return "registration";
    }

}
