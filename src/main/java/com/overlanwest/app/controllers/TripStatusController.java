package com.overlanwest.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.overlanwest.app.dto.tripStatus.response.TripStatusResponse;
import com.overlanwest.app.services.TripStatusService;

@RestController
@RequestMapping("/api/v1/trip-status")
public class TripStatusController {

    @Autowired
    private TripStatusService tripStatusServ;


    @GetMapping("/all-trip-status")
    public ResponseEntity<Page<TripStatusResponse>>getAllTripStatus (Pageable pageable){

        return new ResponseEntity<>(tripStatusServ.getTripStatus(pageable), HttpStatus.FOUND);
    }
    
}
