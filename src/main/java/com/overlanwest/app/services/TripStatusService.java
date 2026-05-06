package com.overlanwest.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.overlanwest.app.dto.tripStatus.response.TripStatusResponse;
import com.overlanwest.app.repositories.TripStatusRespositories;
import com.overlanwest.app.util.TripStatusMapStruct;



@Service
public class TripStatusService {
    
    @Autowired
    private TripStatusRespositories tripStatusRepo;

    @Autowired
    private TripStatusMapStruct tripStatusMap;

    @Transactional(readOnly = true)
    public Page<TripStatusResponse> getTripStatus (Pageable pageable){
        return tripStatusRepo.findAll(pageable).map(tripStatusMap::toDto);
    }


}
