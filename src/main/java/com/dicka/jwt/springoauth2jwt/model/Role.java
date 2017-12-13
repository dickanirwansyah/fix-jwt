package com.dicka.jwt.springoauth2jwt.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "app_role",
        catalog = "dboauth")
public class Role implements Serializable{

    @Id
    @Column(name = "idrole")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idrole;

    @Column(name = "role_name", nullable = false)
    private String roleName;

    @Column(name = "description", nullable = false)
    private String description;

    public int getIdrole(){
        return idrole;
    }

    public void setIdrole(int idrole){
        this.idrole = idrole;
    }

    public String getRoleName(){
        return roleName;
    }

    public void setRoleName(String roleName){
        this.roleName = roleName;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}
