package com.overlanwest.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.overlanwest.app.dto.deliveryStatus.request.CreateDeliveryStatusRequest;
import com.overlanwest.app.dto.deliveryStatus.response.DeliveryStatusResponse;
import com.overlanwest.app.services.DeliveryStatusService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/delivery-status")
public class DeliveryStatusController {


    @Autowired
    private DeliveryStatusService  deliverStatusServ;


    @GetMapping("/all-delivery-status")
    public ResponseEntity<?> getAllDeliveryStatus(Pageable pageable){

        return new ResponseEntity<>(deliverStatusServ.getAllDeliveryStatus(pageable), HttpStatus.FOUND);
    }

    @PostMapping("/create-new-delivery-status")
    public ResponseEntity<?> createNewDeliveryStatus (@Valid @RequestBody CreateDeliveryStatusRequest createDeliveryStatusRequest){
       
        DeliveryStatusResponse newDeliveryStatus = deliverStatusServ.createNewDeliveryStatus(createDeliveryStatusRequest); 
        
        return new ResponseEntity<>(newDeliveryStatus, HttpStatus.CREATED);
    }
}
