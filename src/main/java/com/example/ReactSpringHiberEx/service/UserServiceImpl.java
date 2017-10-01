package com.example.ReactSpringHiberEx.service;

import com.example.ReactSpringHiberEx.model.User;
import com.example.ReactSpringHiberEx.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> userList() {
        return (List<User>) userRepository.findAll();
    }
}
