package com.example.ReactSpringHiberEx;

import com.example.ReactSpringHiberEx.model.Role;
import com.example.ReactSpringHiberEx.model.User;
import com.example.ReactSpringHiberEx.repository.RoleRepository;
import com.example.ReactSpringHiberEx.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@Component
public class DatabaseLoader implements CommandLineRunner {

    private final RoleRepository roleRepository;
    private final UserRepository userRepository;

    @Autowired
    public DatabaseLoader(RoleRepository roleRepository, UserRepository userRepository) {
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
    }

    @Transactional
    public void run(String... strings) throws Exception {
        Collection<User> allusers = (Collection<User>) userRepository.findAll();
        if (allusers.isEmpty()) {
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

            roleRepository.save(new HashSet<Role>() {{
                add(roleUser);
                add(roleAdmin);
            }});
        }

        for (Role role : roleRepository.findAll()) {
            log.info(role.toString());
        }

        for (User user : allusers) {
            log.info(user.toString());
            log.info(user.getRole().getName());
        }
    }
}