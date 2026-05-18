package com.overlanwest.app.util;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.overlanwest.app.dto.fleetAssignment.response.FleetAssignmentResponse;
import com.overlanwest.app.models.FleetAssignment;

@Mapper(componentModel = "spring")
public interface FleetAssignmentMapstruct {


    @Mapping(target = "driver",  source = "fleetAssignment.driver.firstName")
    FleetAssignmentResponse toDto (FleetAssignment fleetAssignment);
    
}
