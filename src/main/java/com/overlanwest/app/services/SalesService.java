package com.overlanwest.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.overlanwest.app.dto.sales.response.SalesResponse;
import com.overlanwest.app.repositories.SalesRepositories;
import com.overlanwest.app.util.SalesMapstruct;

@Service
public class SalesService {
    
    @Autowired
    private SalesRepositories salesRepository;

    @Autowired
    private SalesMapstruct salesMapstruct;

    @Transactional(readOnly = true)
    public Page<SalesResponse> getAllSales (Pageable pageable){

        return salesRepository.findAll(pageable).map(sales -> salesMapstruct.toDto(sales));
    }
}
