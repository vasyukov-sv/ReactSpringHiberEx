package com.example.ReactSpringHiberEx.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
@Data
@Entity
public class Role {
    private @Id @GeneratedValue int id;
    private String name;
    private @OneToMany(mappedBy = "role", cascade = CascadeType.ALL) Set<User> users;

    public Role(String name) {
        this.name = name;
    }

    public Role() {
    }
}
