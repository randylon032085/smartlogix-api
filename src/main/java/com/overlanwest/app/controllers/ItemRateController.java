package com.overlanwest.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.overlanwest.app.services.ItemRatesService;

@RestController
@RequestMapping("/api/v1/item-rates")
public class ItemRateController {

    @Autowired
    private ItemRatesService itemRatesServ;

    @GetMapping("/all-item-rates")
    public ResponseEntity<?> getAllItemRates (Pageable pageable){

        return new ResponseEntity<>(itemRatesServ.getAllItemRates(pageable), HttpStatus.FOUND);
    }
    
}
