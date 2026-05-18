package com.overlanwest.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.overlanwest.app.dto.lineHaul.response.LineHaulResponse;
import com.overlanwest.app.repositories.LineHaulRepositories;
import com.overlanwest.app.util.LineHaulMapstruct;

@Service
public class LineHaulService {
    
    @Autowired
    private LineHaulRepositories lineHaulRepo;

    @Autowired
    private LineHaulMapstruct lineHaulMapstruct;
    
    @Transactional(readOnly = true)
    public Page<LineHaulResponse> getAllLineHaul (Pageable pageable){
        return lineHaulRepo.findAll(pageable).map(lineHaulMapstruct::toDto);
    }

        
    
}
