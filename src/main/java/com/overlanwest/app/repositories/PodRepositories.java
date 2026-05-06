package com.overlanwest.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.overlanwest.app.models.Pod;

public interface PodRepositories extends JpaRepository<Pod, Integer> {
    
}
