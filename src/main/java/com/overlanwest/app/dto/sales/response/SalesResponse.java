package com.overlanwest.app.dto.sales.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesResponse {

    private String customerName;;
    private double accesorial;
    private double weight;
    private double rate;
    private double tarrif;
    private String shipmentDate;
    private String currency;
    private String pickupDate;
    private String zipCode;
    private String cityState;
    private int freightBill;
    private String shipperName;
    private String username;
    private int itemRates;
  
    
    
}
