package com.overlanwest.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.overlanwest.app.models.Manifest;

public interface ManifestRepositories extends JpaRepository<Manifest, Integer> {
    
}
