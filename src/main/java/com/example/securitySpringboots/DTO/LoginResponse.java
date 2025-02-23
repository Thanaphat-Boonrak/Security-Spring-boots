package com.example.securitySpringboots.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
public class LoginResponse {


    private String username;
    private List<String> roles;

    private String jwtToken;
}
