package com.example.ReactSpringHiberEx.repository;

import com.example.ReactSpringHiberEx.model.Role;
import com.example.ReactSpringHiberEx.model.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "inlineRoles", types = {User.class})
interface UserProjections {

    String getLogin();

    String getName();

    Role getRole();
}
