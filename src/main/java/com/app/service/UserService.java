package com.app.service;

import com.app.domain.User;
import com.app.dto.user.UserResquestDTO;
import com.app.exception.userexception.EmailAlreadyRegistered;
import com.app.repository.IUserRepository;
import com.app.utils.user.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final IUserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(IUserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public UserResquestDTO createUser(UserResquestDTO userResquestDTO) {
        if(userRepository.existsByEmail(userResquestDTO.email())) {
            throw new EmailAlreadyRegistered("Email Already Registered");
        }

        UserUtils userUtils = new UserUtils();

        User user = userUtils.convert(userResquestDTO, passwordEncoder);

        userRepository.save(user);

        return userResquestDTO;
    }
}
