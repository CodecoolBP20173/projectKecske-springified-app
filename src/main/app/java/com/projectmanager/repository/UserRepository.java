package com.projectmanager.repository;

import com.projectmanager.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Integer>{
}
