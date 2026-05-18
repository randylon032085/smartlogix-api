package com.overlanwest.app.util;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.overlanwest.app.dto.forceToAssign.response.ForceToAssignResponse;
import com.overlanwest.app.models.ForceToAssign;

@Mapper(componentModel = "spring")
public interface ForceToAssignMapstruct {


    @Mapping(target = "newDriver", source = "forceToAssign.toDriver.firstName")
    @Mapping(target = "reason", source = "forceToAssign.reason")
    @Mapping(target = "lastDriver", source = "forceToAssign.fromDriver.firstName")  
    @Mapping(target = "date", source = "forceToAssign.date")
    @Mapping(target = "startingLocation", source = "forceToAssign.manifest.startingLocation")
    @Mapping(target = "terminalDestination", source = "forceToAssign.manifest.terminalDestination")
  
    @Mapping(target = "shipperName", source = "forceToAssign.manifest.pod.sales.shippers.shipperName")
    @Mapping(target = "shipperAddress", source = "forceToAssign.manifest.pod.sales.shippers.shipperAddress")
    @Mapping(target = "customerName", source = "forceToAssign.manifest.pod.sales.customer.firstName")
    @Mapping(target = "customerAddress", source = "forceToAssign.manifest.pod.sales.customer.address")
    @Mapping(target = "weight", source = "forceToAssign.manifest.pod.sales.weight")
    @Mapping(target = "podNumber", source = "forceToAssign.manifest.pod.podNumber")
    ForceToAssignResponse toDto (ForceToAssign forceToAssign);
    
}
