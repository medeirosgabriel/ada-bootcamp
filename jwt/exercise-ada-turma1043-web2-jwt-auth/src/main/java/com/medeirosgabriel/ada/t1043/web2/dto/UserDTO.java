package com.medeirosgabriel.ada.t1043.web2.dto;

import com.medeirosgabriel.ada.t1043.web2.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private String name;
    private String cpf;
    private String email;
    private String password;
    private Address address;
    private Long role;
}
