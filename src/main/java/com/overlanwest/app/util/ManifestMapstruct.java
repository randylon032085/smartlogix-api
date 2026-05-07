package com.overlanwest.app.util;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.overlanwest.app.dto.manifest.response.ManifestResponse;
import com.overlanwest.app.models.Manifest;

@Mapper(componentModel = "spring")
public interface ManifestMapstruct {


   
    @Mapping(target = "date", source = "manifest.date")
    @Mapping(target = "driver", source = "manifest.user.firstName")
    @Mapping(target = "startingLocation", source = "manifest.startingLocation")
    @Mapping(target = "terminalDestination", source = "manifest.terminalDestination")
    @Mapping(target = "truckDescription", source = "manifest.lineHaul.truckDescription")
    @Mapping(target = "power", source = "manifest.lineHaul.power")
    @Mapping(target = "truckType", source = "manifest.lineHaul.truckType")
    @Mapping(target = "shipperName", source = "manifest.pod.sales.shippers.shipperName")
    @Mapping(target = "shipperAddress", source = "manifest.pod.sales.shippers.shipperAddress")
    @Mapping(target = "customerName", source = "manifest.pod.sales.customer.firstName")
    @Mapping(target = "customerAddress", source = "manifest.pod.sales.customer.address")
    @Mapping(target = "weight", source = "manifest.pod.sales.weight")
    @Mapping(target = "podNumber", source = "manifest.pod.podNumber")
    ManifestResponse toDto (Manifest manifest);
    
}
