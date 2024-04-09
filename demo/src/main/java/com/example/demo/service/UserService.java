package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public UserService() {
        logger.info("Connected to the database successfully");
    }

    public User createUser(User user) {
        User savedUser = userRepository.save(user);
        logger.info("User saved: {}", savedUser);
        return savedUser;
    }
}
