package com.overlanwest.app.dto.manifest.response;

import java.sql.Date;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManifestResponse {

    private Date date;

    //user details
    private String driver;

    //manifest details
    private String startingLocation;
    private String terminalDestination;

  
    

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
