package com.overlanwest.app.dto.forceToAssign.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ForceToAssignResponse {
    
    private String newDriver;
    private String reason;
    private String lastDriver;
    private LocalDateTime date;

    //from manifest
    private String startingLocation;
    private String terminalDestination;

    //line haul details
    private String truckDescription;
    private String power;
    private String truckType;
    

    // Shipper details
    private String shipperName;
    private String shipperAddress;

    // Consignee details or customer
    private String customerName;
    private String customerAddress;

    //sales details
    private double weight;

    //pod details
    private String podNumber;



}
