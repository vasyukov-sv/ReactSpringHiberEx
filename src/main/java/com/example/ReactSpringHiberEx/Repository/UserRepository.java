package com.example.ReactSpringHiberEx.repository;

import com.example.ReactSpringHiberEx.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = UserProjections.class)
public interface UserRepository extends CrudRepository<User, Integer> {
    @Override
    Iterable<User> findAll();

}