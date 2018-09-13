package com.projectmanager.service;

import com.projectmanager.model.UserModel;
import com.projectmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    UserRepository userRepository;

    public void  registerUser(UserModel user) {
        userRepository.save(user);
    }
}
