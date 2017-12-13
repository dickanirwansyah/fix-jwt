package com.dicka.jwt.springoauth2jwt.repository;

import com.dicka.jwt.springoauth2jwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{

    User findByUsername(String username);
}
