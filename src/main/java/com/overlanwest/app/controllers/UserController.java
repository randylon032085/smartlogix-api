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
import com.overlanwest.app.dto.users.request.CreateUserRequest;
import com.overlanwest.app.dto.users.response.UserResponse;

import com.overlanwest.app.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

  

    @GetMapping("/all-user")
    public ResponseEntity<Page<UserResponse>> getAllUser (Pageable pageable){

        return new ResponseEntity<>(userService.getALlUser(pageable), HttpStatus.FOUND);


    
    }


    @GetMapping("/test")
    public ResponseEntity<?> sample (){

        return new ResponseEntity<>("Test" , HttpStatus.FOUND);
    }


    @GetMapping("/test2")
    public ResponseEntity<?> sample2 (){

        return new ResponseEntity<>("Test2" , HttpStatus.FOUND);
    }

   

    @GetMapping("/test4")
    public ResponseEntity<?> sample4 (){

        return new ResponseEntity<>("Test4" , HttpStatus.FOUND);
    }

    @PostMapping("/create-new-user")
    public ResponseEntity<?> createNewUser (@Valid @RequestBody CreateUserRequest createUserRequest){

       UserResponse createNewUser = userService.createNewUser(createUserRequest);

        return new ResponseEntity<>(createNewUser, HttpStatus.CREATED);
    }
}