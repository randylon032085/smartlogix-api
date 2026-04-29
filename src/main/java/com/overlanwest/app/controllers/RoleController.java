package com.overlanwest.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.overlanwest.app.dto.role.response.RoleResponse;

import com.overlanwest.app.services.RoleSerive;

@RestController
@RequestMapping("/api/role")
public class RoleController {
    

    @Autowired
    private RoleSerive roleSerive;

    @GetMapping("/all")
    public ResponseEntity<Page<RoleResponse>> getAllRole (Pageable pageable){
        return new ResponseEntity<>(roleSerive.getAllRole(pageable), HttpStatus.FOUND);
  
    }   

}
