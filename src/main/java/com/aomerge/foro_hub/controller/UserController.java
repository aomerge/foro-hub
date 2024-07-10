package com.aomerge.foro_hub.controller;


import com.aomerge.foro_hub.model.USER;
import com.aomerge.foro_hub.dto.UserDTO;
import com.aomerge.foro_hub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}
