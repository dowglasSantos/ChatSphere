package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.domain.User;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
}
