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

    @PostMapping("/create")
    public ResponseEntity<UserResquestDTO> createUser(@RequestBody UserResquestDTO userResquestDTO) {
        return ResponseEntity.ok(userService.createUser(userResquestDTO));
    }
}
