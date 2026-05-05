package com.overlanwest.app.dto.itemRates.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemRatesResponse {

    private double lnft;
    private double cuft;
    private int seats;
    private int units;
    private int pieces;
    private double invAmt;
    private double codAmt;
    private double decValue;
    private double fscAge;
    private double rateAge;
    private double discAge;
    private String freight;
    private double pstGstHst;
    private double netTotal;

    
}
