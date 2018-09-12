package com.projectmanager.repository;

import com.projectmanager.model.TeamModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface TeamRepository extends JpaRepository<TeamModel, Integer>{
}
