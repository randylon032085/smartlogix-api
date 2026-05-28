package com.overlanwest.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.overlanwest.app.dto.pod.request.CreatePodRequest;
import com.overlanwest.app.dto.pod.response.PodResponse;
import com.overlanwest.app.models.DeliveryStatus;
import com.overlanwest.app.models.Pod;
import com.overlanwest.app.models.Sales;
import com.overlanwest.app.repositories.DeliveryStatusRepositories;
import com.overlanwest.app.repositories.PodRepositories;
import com.overlanwest.app.repositories.SalesRepositories;
import com.overlanwest.app.util.PodMapstruct;

@Service
public class PodService {
    

    @Autowired
    private PodRepositories podRepo;

    @Autowired
    private PodMapstruct podMapstruct;

    @Autowired
    private SalesRepositories salesRepo;

    @Autowired
    private DeliveryStatusRepositories deliveryStatusRepos;


    @Transactional(readOnly = true) 
    public Page<PodResponse> getAllPod (Pageable pageable){

        return podRepo.findAll(pageable).map(podMapstruct::toDto);
    }

    @Transactional
    public PodResponse createNewPod (CreatePodRequest createPodRequest){
        
        Pod pod = podMapstruct.toEntity(createPodRequest);
        
        DeliveryStatus deliveryStatus = deliveryStatusRepos.findById(createPodRequest.getDeliveryStatusId()).orElseThrow(()-> new RuntimeException("Delivery Status Not found" + createPodRequest.getDeliveryStatusId()));

        pod.setDeliveryStatus(deliveryStatus);

        Sales sales = salesRepo.findById(createPodRequest.getSalesId()).orElseThrow(()-> new RuntimeException("Sales Not found" + createPodRequest.getSalesId()));
        pod.setSales(sales);

        Pod savePod = podRepo.save(pod);


        return podMapstruct.toDto(savePod); 


    }

}
