package com.overlanwest.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.overlanwest.app.dto.pod.response.PodResponse;
import com.overlanwest.app.repositories.PodRepositories;
import com.overlanwest.app.util.PodMapstruct;

@Service
public class PodService {
    

    @Autowired
    private PodRepositories podRepo;

    @Autowired
    private PodMapstruct podMapstruct;

    @Transactional(readOnly = true) 
    public Page<PodResponse> getAllPod (Pageable pageable){

        return podRepo.findAll(pageable).map(podMapstruct::toDto);
    }
}
