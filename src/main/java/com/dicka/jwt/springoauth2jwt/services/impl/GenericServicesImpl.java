package com.dicka.jwt.springoauth2jwt.services.impl;

import com.dicka.jwt.springoauth2jwt.model.City;
import com.dicka.jwt.springoauth2jwt.model.User;
import com.dicka.jwt.springoauth2jwt.repository.CityRepository;
import com.dicka.jwt.springoauth2jwt.repository.UserRepository;
import com.dicka.jwt.springoauth2jwt.services.GenericServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenericServicesImpl implements GenericServices {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CityRepository cityRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public List<City> findAllCitys() {
        return cityRepository.findAll();
    }
}
