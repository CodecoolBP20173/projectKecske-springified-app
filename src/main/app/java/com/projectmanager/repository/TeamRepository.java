package com.projectmanager.repository;

import com.projectmanager.model.TeamModel;
import com.projectmanager.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

public interface TeamRepository extends JpaRepository<TeamModel, Integer>{
    List<TeamModel> findAllByTeamLeader(UserModel user);
}
