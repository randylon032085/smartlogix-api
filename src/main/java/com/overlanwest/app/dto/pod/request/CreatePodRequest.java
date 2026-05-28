package com.overlanwest.app.dto.pod.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePodRequest {

    @NotBlank(message = "Pod Number is required")
    private String podNumber;

    @NotNull
    private int salesId;

    @NotNull
    private int deliveryStatusId;

    
}
