package com.overlanwest.app.dto.pod.response;

import java.sql.Date;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PodResponse {
    

    private String podNumber;
    private double accessorial;
    private double weight;
    private double rate;
    private double tarrif;
    private LocalDateTime shipmentDate;
    private String currency;
    private LocalDateTime pickupDate;
    private String zipCode;
    private String cityState;
    private int freightBill;
    private String shipperName;
    private String status;
    private byte[]  photoProof;
    private Date deliveryDate;
    private byte[] signature;
    private String consinee;
}