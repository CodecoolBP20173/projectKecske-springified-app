package com.projectmanager.repository;

import com.projectmanager.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface UserRepository extends JpaRepository<UserModel, Integer>{
    UserModel findByEmail(String email);
}
