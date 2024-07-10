package com.aomerge.foro_hub.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private Boolean isAdmin;

    // controll the access to the user
    public UserDTO(){}

    // contructor whit all the parameters
    public UserDTO(Long id, String name, String lastName, String email, Boolean isAdmin) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.isAdmin = isAdmin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
