package com.aomerge.foro_hub.service;

import com.aomerge.foro_hub.model.USER;
import com.aomerge.foro_hub.dto.UserDTO;
import com.aomerge.foro_hub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> getAllUsers() {
        List<USER> users = userRepository.findAll();
        return users.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public UserDTO getUserById(Long id) {
        USER user = userRepository.findById(id).orElse(null);
        return convertToDTO(user);
    }

    public UserDTO saveUser(UserDTO userDTO) {
        USER user = convertToEntity(userDTO);
        USER savedUser = userRepository.save(user);
        return convertToDTO(savedUser);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    private UserDTO convertToDTO(USER user) {
        return new UserDTO(user.getId(), user.getName(), user.getLastName(), user.getEmail(), user.getAdmin());
    }

    private USER convertToEntity(UserDTO userDTO) {
        USER user = new USER();
        user.setId(userDTO.getId());
        user.setName(userDTO.getName());
        user.setLastName(userDTO.getLastName());
        user.setEmail(userDTO.getEmail());
        user.setAdmin(userDTO.getAdmin());
        return user;
    }
}

