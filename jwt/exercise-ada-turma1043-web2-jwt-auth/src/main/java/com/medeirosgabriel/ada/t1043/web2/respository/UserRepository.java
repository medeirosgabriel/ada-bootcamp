package com.medeirosgabriel.ada.t1043.web2.respository;

import com.medeirosgabriel.ada.t1043.web2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {

    List<User> findByEmail(String email);

}
