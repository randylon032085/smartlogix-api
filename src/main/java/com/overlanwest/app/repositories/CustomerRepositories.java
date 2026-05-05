package com.overlanwest.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.overlanwest.app.models.Customer;

public interface CustomerRepositories extends JpaRepository<Customer, Integer> {
    
}
