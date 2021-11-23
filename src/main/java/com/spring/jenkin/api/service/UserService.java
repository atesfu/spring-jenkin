package com.spring.jenkin.api.service;

import com.spring.jenkin.api.model.User;
import com.spring.jenkin.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public User getOneUSer(Long id) {

        return userRepository.findById(id).orElse(null);
    }

    public User addUser(User newUser) {
        return userRepository.save(newUser);
    }
}
