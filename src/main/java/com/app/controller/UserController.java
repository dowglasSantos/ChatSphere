package com.app.controller;

import com.app.domain.User;
import com.app.dto.user.UserResquestDTO;
import com.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("create-user")
    public ResponseEntity<User> createUser(@RequestBody UserResquestDTO userResquestDTO) {
        if(userResquestDTO.username() != null) {
            return ResponseEntity.ok(userService.createUser(userResquestDTO));
        } else {
            throw new IllegalArgumentException("UserRequestDTO is null " + userResquestDTO.username());
        }
    }
}
