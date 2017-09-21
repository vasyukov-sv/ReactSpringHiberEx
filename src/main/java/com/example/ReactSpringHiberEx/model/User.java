package com.example.ReactSpringHiberEx.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(exclude = "role")
@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;

    @NonNull
    private String login;

    @NonNull
    private String name;

    @NonNull
    @ManyToOne
    private Role role;
}
