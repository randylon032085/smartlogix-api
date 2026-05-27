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

import com.overlanwest.app.dto.trailer.request.CreateTrailerRequest;
import com.overlanwest.app.dto.trailer.response.TrailerResponse;
import com.overlanwest.app.services.TrailerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/trailer")
public class TrailerController {

    @Autowired
    private TrailerService trailerService;


    @GetMapping("/all-trailer")
    public ResponseEntity<Page<TrailerResponse> >getAllTrailer (Pageable pageable){

        return new ResponseEntity<>(trailerService.getAllTrailer(pageable), HttpStatus.FOUND);
    }

    @PostMapping("/create-new-trailer")
    public ResponseEntity<?> createNewTrailer (@Valid @RequestBody CreateTrailerRequest createTrailerRequest){

        TrailerResponse createNewTrailer = trailerService.createNewTrailer(createTrailerRequest);

        return new ResponseEntity<>(createNewTrailer, HttpStatus.CREATED);
    }
   
}
