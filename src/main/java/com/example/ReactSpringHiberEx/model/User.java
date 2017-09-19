package com.example.ReactSpringHiberEx.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
    private @Id @GeneratedValue int id;
    @NonNull private @Column(nullable = false) String login;
    @NonNull private String name;
    @NonNull private @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "idRole", nullable = false) Role role;
}
