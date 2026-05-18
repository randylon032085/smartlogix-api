package com.overlanwest.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.overlanwest.app.dto.manifest.response.ManifestResponse;
import com.overlanwest.app.services.ManifestService;

@RestController
@RequestMapping("/api/v1/manifests")
public class ManifestController {

    @Autowired
    private ManifestService manifestService;
    

    @GetMapping("/all-manifests")
    public ResponseEntity<Page<ManifestResponse>> getAllManifest (Pageable pageable){

        return new ResponseEntity<>(manifestService.getAllManifest(pageable), HttpStatus.OK);
    }
}
