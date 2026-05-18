package com.overlanwest.app.util;

import org.mapstruct.Mapper;

import com.overlanwest.app.dto.customers.response.CustomerResponse;
import com.overlanwest.app.models.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapstruct {
    

    CustomerResponse toDto (Customer customer);
}
