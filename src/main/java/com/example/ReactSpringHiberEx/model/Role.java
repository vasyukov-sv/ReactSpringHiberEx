package com.example.ReactSpringHiberEx.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor

public class Role {
    @Id
    @GeneratedValue
    private int id;

    @NonNull
    private String name;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private Set<User> users;
}