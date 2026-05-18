package com.overlanwest.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.overlanwest.app.dto.fleetAssignment.response.FleetAssignmentResponse;
import com.overlanwest.app.repositories.FleetAssignmentRepositorie;
import com.overlanwest.app.util.FleetAssignmentMapstruct;

@Service
public class FleetAssignmentService {
    
    @Autowired
    private FleetAssignmentMapstruct fleetAssignmentMaps;

    @Autowired
    private FleetAssignmentRepositorie fleetAssignmentRepo;

    @Transactional(readOnly = true)
    public Page<FleetAssignmentResponse> getAllFleetAssignment (Pageable pageable){

        return fleetAssignmentRepo.findAll(pageable).map(fleetAssignmentMaps::toDto);
    }
}
