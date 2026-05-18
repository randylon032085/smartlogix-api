package com.overlanwest.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.overlanwest.app.models.DeliveryStatus;

public interface DeliveryStatusRepositories extends JpaRepository<DeliveryStatus, Integer> {
    
}
