package com.overlanwest.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.overlanwest.app.dto.forceToAssign.response.ForceToAssignResponse;
import com.overlanwest.app.repositories.ForceToAssignRepositories;
import com.overlanwest.app.util.ForceToAssignMapstruct;

@Service
public class ForceToAssignService {
    
    @Autowired
    private ForceToAssignRepositories forceToAssignRepositories;

    @Autowired
    private ForceToAssignMapstruct forceToAssignMapstruct;

    @Transactional(readOnly = true)
    public Page<ForceToAssignResponse> getAllForceToAssign (Pageable pageable){

        return forceToAssignRepositories.findAll(pageable).map(forceToAssignMapstruct::toDto);
    }

}
