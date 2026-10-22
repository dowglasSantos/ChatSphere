package com.app.utils.user;

import com.app.domain.User;
import com.app.dto.user.UserResquestDTO;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDateTime;

public class UserUtils {
    public User convert(UserResquestDTO userResquestDTO, PasswordEncoder passwordEncoder) {
        User user = new User();
        user.setUsername(userResquestDTO.username());
        user.setEmail(userResquestDTO.email());
        user.setPassword_hash(passwordEncoder.encode(userResquestDTO.password_hash()));
        user.setCreated_at(LocalDateTime.now());
        user.setUpdated_at(LocalDateTime.now());

        return user;
    }
}
