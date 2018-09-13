package com.projectmanager.repository;

import com.projectmanager.model.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface TaskRepository extends JpaRepository<TaskModel, Integer>{
}
