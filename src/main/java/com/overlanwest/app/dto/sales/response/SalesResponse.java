package com.overlanwest.app.dto.sales.response;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesResponse {

    private String customerFirstName;
    private String customerLastName;
    private double accesorial;
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
    private String username;
    private int pieces;
    private double netTotal;
  
}
