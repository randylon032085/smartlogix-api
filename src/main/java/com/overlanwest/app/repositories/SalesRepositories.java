package com.overlanwest.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.overlanwest.app.models.Sales;

public interface SalesRepositories extends JpaRepository<Sales, Integer> {
    
}
