package com.overlanwest.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.overlanwest.app.dto.trailer.request.CreateTrailerRequest;
import com.overlanwest.app.dto.trailer.response.TrailerResponse;
import com.overlanwest.app.models.Trailer;
import com.overlanwest.app.repositories.TrailerRepositories;
import com.overlanwest.app.util.TrailerMapstruct;

@Service
public class TrailerService {
    
    @Autowired
    private TrailerMapstruct trailerMaps;

    @Autowired
    private TrailerRepositories trailerRepo;


    @Transactional(readOnly = true)
    public Page<TrailerResponse> getAllTrailer (Pageable pageable){

        return trailerRepo.findAll(pageable).map(trailerMaps::toDto);
    }

    @Transactional
    public TrailerResponse createNewTrailer (CreateTrailerRequest createTrailerRequest){

        Trailer trailer = trailerMaps.toEntity(createTrailerRequest);
    
        Trailer saveTrailer = trailerRepo.save(trailer);

        return trailerMaps.toDto(saveTrailer);
    }
}
