package com.projectmanager.repository;

import com.projectmanager.model.ProjectModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<ProjectModel, Integer>{
}
