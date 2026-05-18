package com.overlanwest.app.util;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.overlanwest.app.dto.lineHaul.response.LineHaulResponse;
import com.overlanwest.app.models.LineHaul;

@Mapper(componentModel = "spring")
public interface LineHaulMapstruct {

 
   
    @Mapping(target = "truckName", source = "lineHaul.truckName")
    @Mapping(target = "truckDescription", source = "lineHaul.truckDescription")
    @Mapping(target = "truckType", source = "lineHaul.truckType")
    @Mapping(target = "power", source = "lineHaul.power")
    LineHaulResponse toDto(LineHaul lineHaul);
    
}
