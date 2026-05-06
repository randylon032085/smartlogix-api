package com.overlanwest.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.overlanwest.app.dto.lineHaul.response.LineHaulResponse;
import com.overlanwest.app.services.LineHaulService;

@RestController
@RequestMapping("/api/v1/line-haul")
public class LineHaulController {
    

    @Autowired
    private LineHaulService lineHaulService;

    @GetMapping("/all-line-haul")
    public ResponseEntity<Page<LineHaulResponse>> getAllLineHaul (Pageable pageable){

        return new ResponseEntity<>(lineHaulService.getAllLineHaul(pageable), HttpStatus.FOUND);
    }
}
