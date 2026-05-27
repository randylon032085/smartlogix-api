package com.overlanwest.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.overlanwest.app.dto.shippers.request.CreateShippersRequest;
import com.overlanwest.app.dto.shippers.response.ShippersResponse;
import com.overlanwest.app.models.Shippers;
import com.overlanwest.app.repositories.ShipperRepositories;
import com.overlanwest.app.util.ShipperMapstruct;

@Service
public class ShipperService {
    

    @Autowired
    private ShipperMapstruct shipperMaps;

    @Autowired
    private ShipperRepositories shipperRepo;


    @Transactional(readOnly = true)
    public Page<ShippersResponse> getAllShippers(Pageable pageable){
        return shipperRepo.findAll(pageable).map(shipperMaps::toDto);
    }

    @Transactional
    public ShippersResponse createNewShippers (CreateShippersRequest createShipperRequest){

        Shippers newShipper = shipperMaps.toEntity(createShipperRequest);
        
        Shippers savedShippers = shipperRepo.save(newShipper);

        return shipperMaps.toDto(savedShippers);
    }
}
