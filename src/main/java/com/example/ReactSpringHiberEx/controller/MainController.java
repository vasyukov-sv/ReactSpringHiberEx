package com.example.ReactSpringHiberEx.controller;

import com.example.ReactSpringHiberEx.model.User;
import com.example.ReactSpringHiberEx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {
    private UserService userService;
    @Autowired
    //better go with constructor injection
    public MainController(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping(value = "/")
    public String index() {
        return "index.html";
    }

    @RequestMapping("/list")
    public List<User> userList() {
        return userService.userList();
    }
}