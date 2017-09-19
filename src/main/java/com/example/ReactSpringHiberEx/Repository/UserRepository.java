package com.example.ReactSpringHiberEx.Repository;

import com.example.ReactSpringHiberEx.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}