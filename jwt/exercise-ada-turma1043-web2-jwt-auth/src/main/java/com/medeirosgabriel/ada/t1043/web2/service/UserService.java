package com.medeirosgabriel.ada.t1043.web2.service;

import com.medeirosgabriel.ada.t1043.web2.dto.UserDTO;
import com.medeirosgabriel.ada.t1043.web2.entity.User;

import java.util.List;

public interface UserService {
    User insertUser(UserDTO userDTO);
    List<User> getAllUsers();
    User findById(String userId);
}
