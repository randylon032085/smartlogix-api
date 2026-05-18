package com.overlanwest.app.util;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.overlanwest.app.dto.sales.response.SalesResponse;
import com.overlanwest.app.models.Sales;

@Mapper(componentModel = "spring")
public interface SalesMapstruct {
    
    @Mapping(target = "customerFirstName", source = "sales.customer.firstName")
    @Mapping(target = "customerLastName", source = "sales.customer.lastName")
    @Mapping(target = "netTotal", source  = "sales.itemRates.netTotal")
    @Mapping(target = "pieces", source = "sales.itemRates.pieces")
    @Mapping(target = "shipperName", source = "sales.shippers.shipperName")
    @Mapping(target = "username", source = "sales.user.username")
    SalesResponse toDto (Sales sales);
}
