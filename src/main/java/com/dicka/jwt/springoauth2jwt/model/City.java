package com.dicka.jwt.springoauth2jwt.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "city",
        catalog = "dboauth")
public class City implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcity")
    private int idcity;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    public int getIdcity(){
        return idcity;
    }

    public void setIdcity(int idcity){
        this.idcity = idcity;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}
