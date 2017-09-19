package com.example.ReactSpringHiberEx;

import com.example.ReactSpringHiberEx.Repository.RoleRepository;
import com.example.ReactSpringHiberEx.model.Role;
import com.example.ReactSpringHiberEx.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Component

public class DatabaseLoader implements CommandLineRunner {

    private final RoleRepository roleRepository;

    @Autowired
    public DatabaseLoader(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
    @Transactional
    public void run(String... strings) throws Exception {

        Role roleUser = new Role("user");
        Set<User> users = new HashSet<User>() {{
            add(new User("user1", "Vasya", roleUser));
            add(new User("user2", "Petya", roleUser));
            add(new User("user3", "Kolya", roleUser));
        }};
        roleUser.setUsers(users);


        Role roleAdmin = new Role("admin");
        Set<User> admins = new HashSet<User>() {{
            add(new User("admin1", "Isabel", roleAdmin));
            add(new User("admin2", "Fred", roleAdmin));
            add(new User("admin3", "Denis", roleAdmin));
        }};
        roleAdmin.setUsers(admins);

//        roleRepository.save(new HashSet<Role>() {{
//            add(roleUser);
//            add(roleAdmin);
//        }});

        // fetch all categories
        for (Role role : roleRepository.findAll()) {
            log.info(role.toString());
        }
    }
}