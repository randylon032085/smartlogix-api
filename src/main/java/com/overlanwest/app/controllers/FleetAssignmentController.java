package com.overlanwest.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.overlanwest.app.dto.fleetAssignment.response.FleetAssignmentResponse;
import com.overlanwest.app.services.FleetAssignmentService;

@RestController
@RequestMapping("/api/v1/fleet-assignment")
public class FleetAssignmentController {

    @Autowired
    private FleetAssignmentService fleetAssignmentServ;


    @GetMapping("/all-fleet-assignment")
    public ResponseEntity<Page<FleetAssignmentResponse>>getALlFleetAssignment (Pageable pageable){

        return new ResponseEntity<>(fleetAssignmentServ.getAllFleetAssignment(pageable), HttpStatus.FOUND);
    }
    
}
