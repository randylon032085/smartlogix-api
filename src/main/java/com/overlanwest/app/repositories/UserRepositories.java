package com.overlanwest.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.overlanwest.app.models.User;

public interface UserRepositories extends JpaRepository<User, Integer> {
    
}
