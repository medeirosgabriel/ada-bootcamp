package com.medeirosgabriel.ada.t1043.web2.service;

import com.medeirosgabriel.ada.t1043.web2.dto.UserDTO;
import com.medeirosgabriel.ada.t1043.web2.entity.Role;
import com.medeirosgabriel.ada.t1043.web2.entity.User;
import com.medeirosgabriel.ada.t1043.web2.respository.RoleRepository;
import com.medeirosgabriel.ada.t1043.web2.respository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService, UserDetailsService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Override
    public User insertUser(UserDTO userDTO) {
        Role role = this.roleRepository.findById(userDTO.getRole()).get();

        PasswordEncoder encoder = new BCryptPasswordEncoder();
        String password = encoder.encode(userDTO.getPassword());
        User user = new User(userDTO.getName(), userDTO.getCpf(), userDTO.getEmail(), password, userDTO.getAddress(), role);
        return this.userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public User findById(String userId) {
        return this.userRepository.findById(userId).get();
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return this.userRepository.findByEmail(email).get(0);
    }
}
