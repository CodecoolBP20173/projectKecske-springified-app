package com.projectmanager.controller;

import com.projectmanager.model.UserModel;
import com.projectmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/list")
    public List<UserModel> getAllUsers() {
        List<UserModel> users = new ArrayList<>();
        users.addAll(userRepository.findAll());
        return users;
    }

    /*@PostMapping("/list")
    public List<Todo> listAll(@RequestParam("status") String status) {
        return StringUtils.isEmpty(status) ? repository.findAll() : repository.findAllByStatusEquals(Status.valueOf(status.toUpperCase()));
    }*/


}
