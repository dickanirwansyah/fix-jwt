package com.dicka.jwt.springoauth2jwt.repository;

import com.dicka.jwt.springoauth2jwt.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RoleRepository extends JpaRepository<Role, Integer>{
}
