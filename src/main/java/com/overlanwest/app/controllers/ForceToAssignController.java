package com.overlanwest.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.overlanwest.app.dto.forceToAssign.response.ForceToAssignResponse;

import com.overlanwest.app.services.ForceToAssignService;

@RestController
@RequestMapping("/api/v1/force-to-assign")
public class ForceToAssignController {

    @Autowired
    private ForceToAssignService forceToAssignService;

    @GetMapping("/all-force-to-assign")
    public ResponseEntity<Page<ForceToAssignResponse>> getAllForceToAssign (Pageable pageable){

        return new ResponseEntity<>(forceToAssignService.getAllForceToAssign(pageable), HttpStatus.FOUND);
    }
    
}
