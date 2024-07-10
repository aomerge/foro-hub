package com.aomerge.foro_hub.service;

import com.aomerge.foro_hub.model.USER;
import com.aomerge.foro_hub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<USER> getAllUsers(){
        return userRepository.findAll();
    }

    public List<USER> getUserById(Long id) {
        return (List<USER>) userRepository.findById(id).orElse(null);
    }
    public USER saveUser(USER user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
