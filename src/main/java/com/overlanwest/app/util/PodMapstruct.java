package com.overlanwest.app.util;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.overlanwest.app.dto.pod.response.PodResponse;
import com.overlanwest.app.models.Pod;

@Mapper(componentModel = "spring")
public interface PodMapstruct {

   @Mapping(target = "accessorial", source = "pod.sales.accessorial")
    @Mapping(target = "weight", source = "pod.sales.weight")
    @Mapping(target = "rate", source = "pod.sales.rate")
    @Mapping(target = "tarrif", source = "pod.sales.tarrif")
    @Mapping(target = "shipmentDate", source = "pod.sales.shipmentDate")
    @Mapping(target = "currency", source = "pod.sales.currency")
    @Mapping(target = "pickupDate", source = "pod.sales.pickupDate")
    @Mapping(target = "zipCode", source = "pod.sales.zipCode")
    @Mapping(target = "cityState", source = "pod.sales.cityState")
    @Mapping(target = "freightBill", source = "pod.sales.freightBill")
    @Mapping(target = "status", source = "pod.deliveryStatus.status")
    @Mapping(target = "shipperName", source = "pod.sales.shippers.shipperName")
    @Mapping(target = "photoProof", source = "pod.deliveryStatus.photoProof")
    @Mapping(target = "deliveryDate", source = "pod.deliveryStatus.deliveryDate")
    @Mapping(target = "signature", source = "pod.deliveryStatus.signature")
    @Mapping(target = "consinee", source = "pod.deliveryStatus.consignee")
    PodResponse toDto (Pod pod);
    
}
