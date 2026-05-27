package com.overlanwest.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.overlanwest.app.models.Role;

public interface RoleRepositories extends JpaRepository<Role, Integer> {
    
    Role findByRolename(String rolename);
}
