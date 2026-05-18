package com.overlanwest.app.util;

import org.mapstruct.Mapper;

import com.overlanwest.app.dto.itemRates.response.ItemRatesResponse;
import com.overlanwest.app.models.ItemRates;

@Mapper(componentModel = "spring")
public interface ItemRateMapstruct {
    

    ItemRatesResponse toDto (ItemRates itemRates);
}
