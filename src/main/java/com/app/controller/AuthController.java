package com.app.controller;

import com.app.dto.login.LoginRequestDTO;
import com.app.dto.login.LoginResponseDTO;
import com.app.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    AuthService authService;

    @PostMapping
    public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO loginRequestDTO) {
        if(loginRequestDTO != null) {
            return ResponseEntity.ok(authService.validLogin(loginRequestDTO));
        }

        throw  new RuntimeException("Invalid Login Request");
    }

    @GetMapping("/me")
    public String me(Authentication authentication){
        return authentication.getName();
    }
}
