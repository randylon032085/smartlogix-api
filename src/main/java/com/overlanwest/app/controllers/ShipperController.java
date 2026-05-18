package com.overlanwest.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.overlanwest.app.dto.shippers.response.ShippersResponse;
import com.overlanwest.app.services.ShipperService;

@RestController
@RequestMapping("/api/v1/shippers")
public class ShipperController {
    

    @Autowired
    private ShipperService shipperService;

    @GetMapping("/all-shippers")
    public ResponseEntity<Page<ShippersResponse>> getAllShippers(Pageable pageable ){

        return new ResponseEntity<>(shipperService.getAllShippers(pageable), HttpStatus.FOUND);
    }
}
