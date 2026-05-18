package com.overlanwest.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.overlanwest.app.dto.pod.response.PodResponse;
import com.overlanwest.app.services.PodService;

@RestController
@RequestMapping("/api/v1/pod")
public class PodController {

    @Autowired
    private PodService podService;

    @GetMapping("/all-pod")
    public ResponseEntity<Page<PodResponse>> getAllPod (Pageable pageable){

        return new ResponseEntity<>(podService.getAllPod(pageable), HttpStatus.FOUND);
    }
    
}
