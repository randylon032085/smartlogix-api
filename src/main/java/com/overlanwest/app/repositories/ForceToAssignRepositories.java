package com.overlanwest.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.overlanwest.app.models.ForceToAssign;

public interface ForceToAssignRepositories extends JpaRepository<ForceToAssign, Integer> {
    
}
