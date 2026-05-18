package com.overlanwest.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.overlanwest.app.dto.customers.response.CustomerResponse;
import com.overlanwest.app.repositories.CustomerRepositories;
import com.overlanwest.app.util.CustomerMapstruct;



@Service
public class CustomerService {

    @Autowired
    private CustomerMapstruct customMaps;

    @Autowired
    private CustomerRepositories customRepo;


    @Transactional(readOnly = true)
    public Page<CustomerResponse> getAllCustomer (Pageable pageable){
    
        return customRepo.findAll(pageable).map(customMaps::toDto);

    }
    
}
