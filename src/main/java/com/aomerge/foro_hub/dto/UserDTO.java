package com.aomerge.foro_hub.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private Boolean isAdmin;

    // controll the access to the user
}
