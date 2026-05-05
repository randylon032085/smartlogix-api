package com.overlanwest.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.overlanwest.app.dto.customers.response.CustomerResponse;
import com.overlanwest.app.services.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerServ;


    @GetMapping("/all-customer")
    public ResponseEntity<Page<CustomerResponse>> getAllCustomer (Pageable pageable){

        return new ResponseEntity<>(customerServ.getAllCustomer(pageable), HttpStatus.FOUND);
    } 
}