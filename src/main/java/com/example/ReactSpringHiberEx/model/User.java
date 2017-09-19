package com.example.ReactSpringHiberEx.model;

import lombok.Data;
import javax.persistence.Id;

import javax.persistence.*;


@Data
@Entity
public class User {
    private @Id @GeneratedValue int id;
    private @Column(name = "login", nullable = false) String login;
    private String name;
    private @ManyToOne(fetch = FetchType.LAZY)  @JoinColumn(name = "idRole", nullable = false) Role idRole;

    public User(String login, String name, Role idRole) {
        this.login = login;
        this.name = name;
        this.idRole = idRole;
    }

    public User() {
    }
}
