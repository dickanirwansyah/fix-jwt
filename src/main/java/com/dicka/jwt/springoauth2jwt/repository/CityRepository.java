package com.dicka.jwt.springoauth2jwt.repository;

import com.dicka.jwt.springoauth2jwt.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CityRepository extends JpaRepository<City, Integer>{
}
