package com.overlanwest.app.util;

import org.mapstruct.Mapper;

import com.overlanwest.app.dto.trailer.request.CreateTrailerRequest;
import com.overlanwest.app.dto.trailer.response.TrailerResponse;
import com.overlanwest.app.models.Trailer;

@Mapper(componentModel = "spring")
public interface TrailerMapstruct {


    TrailerResponse toDto (Trailer trailer);
    

    Trailer toEntity (CreateTrailerRequest createTrailerRequest);
}
