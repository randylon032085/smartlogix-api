package com.overlanwest.app.util;

import org.mapstruct.Mapper;


import com.overlanwest.app.dto.deliveryStatus.response.DeliveryStatusResponse;
import com.overlanwest.app.models.DeliveryStatus;

@Mapper(componentModel = "spring")
public interface DeliveryStatusMapstruct {

    
    DeliveryStatusResponse toDto(DeliveryStatus deliveryStatus);
    
}
