package com.example.ReactSpringHiberEx;

import com.example.ReactSpringHiberEx.Repository.RoleRepository;
import com.example.ReactSpringHiberEx.Repository.UserRepository;
import com.example.ReactSpringHiberEx.model.Role;
import com.example.ReactSpringHiberEx.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DatabaseLoader implements CommandLineRunner {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Autowired
    public DatabaseLoader(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    public void run(String... strings) throws Exception {
        this.roleRepository.save(new Role("Admin"));
        this.userRepository.save(new User("admin", "Admin", new Role("Admin")));
    }
}