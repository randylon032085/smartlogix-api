package com.overlanwest.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.overlanwest.app.models.Trailer;

public interface TrailerRepositories extends JpaRepository<Trailer, Integer>{
    
}
