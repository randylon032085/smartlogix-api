package com.overlanwest.app.dto.deliveryStatus.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryStatusResponse {

    private String status;
    private byte[]  photoProof;
    private String deliveryDate;
    private byte[] signature;
    private String consignee;
    

    
}
