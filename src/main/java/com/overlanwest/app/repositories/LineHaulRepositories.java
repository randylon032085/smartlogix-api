package com.overlanwest.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.overlanwest.app.models.LineHaul;

public interface LineHaulRepositories extends JpaRepository<LineHaul, Integer> {
    
}
