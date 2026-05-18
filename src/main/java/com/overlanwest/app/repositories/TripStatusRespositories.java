package com.overlanwest.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.overlanwest.app.models.TripStatus;

public interface TripStatusRespositories extends JpaRepository<TripStatus, Integer> {
    
}
