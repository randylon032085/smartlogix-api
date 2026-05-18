package com.overlanwest.app.services;

import java.util.jar.Manifest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.overlanwest.app.dto.manifest.response.ManifestResponse;
import com.overlanwest.app.repositories.ManifestRepositories;
import com.overlanwest.app.util.ManifestMapstruct;

@Service
public class ManifestService {
    

    @Autowired
    private ManifestMapstruct manifestMapstruct;

    @Autowired
    private ManifestRepositories manifestRepositories;

    @Transactional(readOnly = true)
    public Page<ManifestResponse> getAllManifest (Pageable pageable){

        return manifestRepositories.findAll(pageable).map(manifest -> manifestMapstruct.toDto(manifest));
    } 
}
