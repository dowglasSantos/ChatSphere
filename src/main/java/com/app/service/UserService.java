package com.app.service;

import com.app.domain.User;
import com.app.dto.user.UserResquestDTO;
import com.app.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserService {
    private final IUserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(IUserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User createUser(UserResquestDTO userResquestDTO) {
        LocalDateTime date = LocalDateTime.now();

        User user = new User();
        user.setUsername(userResquestDTO.username());
        user.setEmail(userResquestDTO.email());
        user.setPassword_hash(passwordEncoder.encode(userResquestDTO.password_hash()));
        user.setCreated_at(date);
        user.setUpdated_at(date);

        return userRepository.save(user);
    }
}
