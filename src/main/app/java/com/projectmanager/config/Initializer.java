package com.projectmanager.config;

import com.projectmanager.model.TeamModel;
import com.projectmanager.model.UserModel;
import com.projectmanager.repository.ProjectRepository;
import com.projectmanager.repository.TaskRepository;
import com.projectmanager.repository.TeamRepository;
import com.projectmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Initializer {

    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    TaskRepository taskRepository;
    @Autowired
    TeamRepository teamRepository;
    @Autowired
    UserRepository userRepository;

    @Bean
    public CommandLineRunner initialize() {
        return (String... args) -> {
            userRepository.save(new UserModel("admin", "admin", "admin@admin.com"));
            userRepository.save(new UserModel("Varga Marci", "marci", "marciVarga@gmail.com"));
            userRepository.save(new UserModel("Németh Andi", "andi", "nemethAndi@gmail.com"));
            userRepository.save(new UserModel("Tovics", "tovics", "tovics@gmail.com"));
            userRepository.save(new UserModel("Horinka Peti", "peti", "horinkaPeti@gmail.com"));

            teamRepository.save(new TeamModel("div1"));
            teamRepository.save(new TeamModel("div2"));
            teamRepository.save(new TeamModel("div3"));
            teamRepository.save(new TeamModel("div4"));
        };
    }
}
