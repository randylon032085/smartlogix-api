package com.overlanwest.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.overlanwest.app.dto.itemRates.request.CreateItemRateRequest;
import com.overlanwest.app.dto.itemRates.response.ItemRatesResponse;
import com.overlanwest.app.models.ItemRates;
import com.overlanwest.app.repositories.ItemRateRepositories;
import com.overlanwest.app.util.ItemRateMapstruct;


@Service
public class ItemRatesService {

    @Autowired
    private ItemRateMapstruct itemRateMaps;

    @Autowired
    private ItemRateRepositories itemRateRepo;

    @Transactional(readOnly = true)
    public Page<ItemRatesResponse> getAllItemRates (Pageable pageable){


        return itemRateRepo.findAll(pageable).map(itemRateMaps::toDto);
    }

    @Transactional
    public ItemRatesResponse createItemRate (CreateItemRateRequest createItemRateRequest){
        
        ItemRates newItemRate = itemRateMaps.toEntity(createItemRateRequest);

        ItemRates savedItemRate = itemRateRepo.save(newItemRate)
;
        return itemRateMaps.toDto(savedItemRate);
    }

   

}