package com.app.service;

import com.app.domain.User;
import com.app.dto.login.LoginRequestDTO;
import com.app.dto.login.LoginResponseDTO;
import com.app.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final IUserRepository userRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public AuthService(IUserRepository userRepository, JwtService jwtService, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.jwtService = jwtService;
        this.passwordEncoder = passwordEncoder;
    }

    // GET trazendo os dados dá página de login
    public LoginResponseDTO validLogin(LoginRequestDTO loginRequestDTO) {
        User user = userRepository.findByEmail(loginRequestDTO.email()).orElseThrow(
                () -> {
                    throw new UsernameNotFoundException("Email invalid");
                }
        );

        if(!passwordEncoder.matches(loginRequestDTO.password_hash(), user.getPassword())) {
            throw new RuntimeException("incorrect password");
        }

        String token = jwtService.getSecretToken(user);

        return new LoginResponseDTO(token);
    }
}
