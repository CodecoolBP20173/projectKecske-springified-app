package com.projectmanager.repository;

import com.projectmanager.model.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskModel, Integer>{
}
