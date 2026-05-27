package com.overlanwest.app.dto.shippers.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateShippersRequest {
    
    @NotBlank(message = "Shipper name is required")
    private String shipperName;

    @NotBlank(message = "Shipper address is required")
    private String shipperAddress;

    @NotNull(message = "Shipper contact is required")
    private int shipperContact;

    @NotBlank(message = "Shipper email is required")
    private String shipperEmail;
}
