package com.projectmanager.controller;

import com.projectmanager.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProjectController {

    @Autowired
    ProjectRepository repository;

}
