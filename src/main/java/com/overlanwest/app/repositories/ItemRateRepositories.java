package com.overlanwest.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.overlanwest.app.models.ItemRates;

public interface ItemRateRepositories extends JpaRepository<ItemRates, Integer> {
    
}
