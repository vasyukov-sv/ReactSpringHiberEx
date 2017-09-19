package com.example.ReactSpringHiberEx.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor

public class Role {
    private @Id @GeneratedValue int id;
    @NonNull  private String name;
    private @OneToMany(mappedBy = "role", cascade = CascadeType.ALL) Set<User> users;

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", users=" + users +
                '}';
    }
}
