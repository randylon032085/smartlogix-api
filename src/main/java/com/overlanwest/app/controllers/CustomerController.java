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

import com.overlanwest.app.dto.customers.request.CreateCustomerRequest;
import com.overlanwest.app.dto.customers.response.CustomerResponse;
import com.overlanwest.app.services.CustomerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerServ;


    @GetMapping("/all-customer")
    public ResponseEntity<Page<CustomerResponse>> getAllCustomer (Pageable pageable){

        return new ResponseEntity<>(customerServ.getAllCustomer(pageable), HttpStatus.FOUND);
        
    } 

    @PostMapping("/create-new-customer")
    public ResponseEntity<?> createNewCustomer (@Valid @RequestBody CreateCustomerRequest createCustomerRequest){

        CustomerResponse newCustomer = customerServ.createNewCustomer(createCustomerRequest);

        return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
        
    }

     @PostMapping("/create-new-customer-test")
    public ResponseEntity<?> createNewCustomer2 (@Valid @RequestBody CreateCustomerRequest createCustomerRequest){

        CustomerResponse newCustomer = customerServ.createNewCustomer(createCustomerRequest);

        return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
    }
}