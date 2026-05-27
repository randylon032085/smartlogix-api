package com.overlanwest.app.dto.customers.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCustomerRequest {
    
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String phoneNumber;
}
