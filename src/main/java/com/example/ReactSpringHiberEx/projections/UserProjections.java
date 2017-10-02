package com.example.ReactSpringHiberEx.projections;

import com.example.ReactSpringHiberEx.model.Role;
import com.example.ReactSpringHiberEx.model.User;
import org.springframework.data.rest.core.config.Projection;

@SuppressWarnings("unused")
@Projection(types = {User.class})
public interface UserProjections {
    String getLogin();

    String getName();

    Role getRole();
}
