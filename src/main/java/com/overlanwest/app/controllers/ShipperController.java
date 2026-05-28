package com.overlanwest.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.overlanwest.app.dto.shippers.request.CreateShippersRequest;
import com.overlanwest.app.dto.shippers.response.ShippersResponse;
import com.overlanwest.app.services.ShipperService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/shippers")
public class ShipperController {
    

    @Autowired
    private ShipperService shipperService;

    @GetMapping("/all-shippers")
    public ResponseEntity<Page<ShippersResponse>> getAllShippers(Pageable pageable ){

        return new ResponseEntity<>(shipperService.getAllShippers(pageable), HttpStatus.FOUND);
    }

    @PostMapping("/create-new-shipper")
    public ResponseEntity<?> createNewShipper (@Valid @RequestBody CreateShippersRequest createShippersRequest){

        ShippersResponse newShipper = shipperService.createNewShippers(createShippersRequest);

        return new ResponseEntity<> (newShipper, HttpStatus.CREATED);
    }


}
