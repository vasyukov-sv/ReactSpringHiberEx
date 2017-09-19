package com.example.ReactSpringHiberEx.model;

import lombok.Data;
import javax.persistence.*;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
@Data
@Entity
public class User {
    private @Id @GeneratedValue int id;
    private @Column(nullable = false) String login;
    private String name;
    private @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "idRole", nullable = false) Role role;

    public User(String login, String name, Role role) {
        this.login = login;
        this.name = name;
        this.role = role;
    }

    public User() {
    }
}
