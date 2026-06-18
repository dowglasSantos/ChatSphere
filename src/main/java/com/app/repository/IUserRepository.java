package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
}
