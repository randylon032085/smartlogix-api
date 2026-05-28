package com.overlanwest.app.dto.deliveryStatus.request;

import java.sql.Date;

import io.micrometer.common.lang.NonNull;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateDeliveryStatusRequest {

    @NotBlank(message = "Status is required")
    private String status;

    @NonNull
    private byte[] photoProof;

    @NonNull
    private Date deliveryDate;

    @NonNull
    private byte[] signature;

    @NotBlank(message = "Consignee is required")
    private String consignee;

    
}
