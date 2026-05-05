package com.overlanwest.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.overlanwest.app.dto.sales.response.SalesResponse;

import com.overlanwest.app.services.SalesService;

@RestController
@RequestMapping("/api/v1/sales")
public class SalesController {
    

    @Autowired
    private SalesService salesService;


    @GetMapping("/all-sales")
    public ResponseEntity<Page<SalesResponse>> getAllSales (Pageable pageable){

        return new ResponseEntity<>(salesService.getAllSales(pageable), HttpStatus.FOUND);
    }
}
