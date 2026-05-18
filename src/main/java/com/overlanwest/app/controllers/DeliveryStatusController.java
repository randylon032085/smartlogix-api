package com.overlanwest.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.overlanwest.app.services.DeliveryStatusService;

@RestController
@RequestMapping("/api/v1/delivery-status")
public class DeliveryStatusController {


    @Autowired
    private DeliveryStatusService  deliverStatusServ;


    @GetMapping("/all-delivery-status")
    public ResponseEntity<?> getAllDeliveryStatus(Pageable pageable){

        return new ResponseEntity<>(deliverStatusServ.getAllDeliveryStatus(pageable), HttpStatus.FOUND);
    }
}
