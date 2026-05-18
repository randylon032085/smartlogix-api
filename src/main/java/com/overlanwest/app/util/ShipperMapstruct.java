package com.overlanwest.app.util;

import org.mapstruct.Mapper;

import com.overlanwest.app.dto.shippers.response.ShippersResponse;
import com.overlanwest.app.models.Shippers;

@Mapper(componentModel = "spring")
public interface ShipperMapstruct {

    ShippersResponse toDto(Shippers shippers);
    
}
