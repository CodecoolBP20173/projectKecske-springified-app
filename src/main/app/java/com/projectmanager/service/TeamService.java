package com.projectmanager.service;

import com.projectmanager.model.TeamModel;
import com.projectmanager.model.UserModel;
import com.projectmanager.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public void addTeam(TeamModel teamModel) {
        teamRepository.save(teamModel);
    }

    public List findRelatedTeam(UserModel user){
        return teamRepository.findAllByTeamLeader(user);
    }

}
