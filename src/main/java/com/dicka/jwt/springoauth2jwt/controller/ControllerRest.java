package com.dicka.jwt.springoauth2jwt.controller;

import com.dicka.jwt.springoauth2jwt.model.City;
import com.dicka.jwt.springoauth2jwt.model.User;
import com.dicka.jwt.springoauth2jwt.services.GenericServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/springjwt")
public class ControllerRest {

    @Autowired
    private GenericServices genericServices;

    @GetMapping(value = "/cities")
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public ResponseEntity<List<City>> getCity(){
        List<City> citys = genericServices.findAllCitys();
        if(citys.isEmpty()){
            return new ResponseEntity<List<City>>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<List<City>>(citys, HttpStatus.OK);
    }

    @GetMapping(value = "/users")
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public ResponseEntity<List<User>> getUsers(){
        List<User> userList = genericServices.findAllUser();
        if(userList.isEmpty()){
            return new ResponseEntity<List<User>>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
    }
}
