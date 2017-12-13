package com.dicka.jwt.springoauth2jwt.services;

import com.dicka.jwt.springoauth2jwt.model.City;
import com.dicka.jwt.springoauth2jwt.model.User;

import java.util.List;

public interface GenericServices {

    User findByUsername(String username);

    List<User> findAllUser();

    List<City> findAllCitys();
}
