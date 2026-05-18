package com.overlanwest.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.overlanwest.app.models.Shippers;

public interface ShipperRepositories extends JpaRepository<Shippers, Integer> {
    
}
