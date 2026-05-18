package com.overlanwest.app.util;

import org.mapstruct.Mapper;

import com.overlanwest.app.dto.tripStatus.response.TripStatusResponse;
import com.overlanwest.app.models.TripStatus;

@Mapper(componentModel = "spring")
public interface TripStatusMapStruct {
    
    TripStatusResponse toDto (TripStatus tripStatus);
}
