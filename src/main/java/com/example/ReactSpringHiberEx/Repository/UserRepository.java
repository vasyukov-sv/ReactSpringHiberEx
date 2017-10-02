package com.example.ReactSpringHiberEx.repository;

import com.example.ReactSpringHiberEx.model.User;
import com.example.ReactSpringHiberEx.projections.UserProjections;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = UserProjections.class)
public interface UserRepository extends CrudRepository<User, Integer> {

}