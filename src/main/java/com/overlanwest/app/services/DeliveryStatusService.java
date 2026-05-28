package com.overlanwest.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.overlanwest.app.dto.deliveryStatus.request.CreateDeliveryStatusRequest;
import com.overlanwest.app.dto.deliveryStatus.response.DeliveryStatusResponse;
import com.overlanwest.app.models.DeliveryStatus;
import com.overlanwest.app.repositories.DeliveryStatusRepositories;
import com.overlanwest.app.util.DeliveryStatusMapstruct;

@Service
public class DeliveryStatusService {
    

    @Autowired
    private DeliveryStatusRepositories deliveryRepo;

    @Autowired
    private DeliveryStatusMapstruct deliveryStatusMap;


    @Transactional(readOnly = true)
    public Page<DeliveryStatusResponse> getAllDeliveryStatus (Pageable pageable){
        return deliveryRepo.findAll(pageable).map(deliveryStatusMap::toDto);

    }

    @Transactional
    public DeliveryStatusResponse createNewDeliveryStatus (CreateDeliveryStatusRequest createDeliveryStatusRequest){

       DeliveryStatus newDeliveryStatus = deliveryStatusMap.toEntity(createDeliveryStatusRequest);

       DeliveryStatus savedDeliveryStatus = deliveryRepo.save(newDeliveryStatus);

       return deliveryStatusMap.toDto(savedDeliveryStatus);

    }
}
