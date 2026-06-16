package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.domain.User;

public interface IUserRepository extends JpaRepository<User, String> {
}
