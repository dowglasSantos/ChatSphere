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

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO loginRequestDTO) {
        return ResponseEntity.ok(authService.validLogin(loginRequestDTO));
    }

    @GetMapping("/me")
    public String me(Authentication authentication){
        return authentication.getName();
    }
}
