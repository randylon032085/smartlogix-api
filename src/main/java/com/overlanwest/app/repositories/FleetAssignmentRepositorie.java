package com.overlanwest.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.overlanwest.app.models.FleetAssignment;

public interface FleetAssignmentRepositorie extends JpaRepository<FleetAssignment, Integer> {
    
}
