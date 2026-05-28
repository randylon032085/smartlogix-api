package com.overlanwest.app.dto.itemRates.request;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateItemRateRequest {

    @NotNull(message = "LNFT is required")
    private double lnft;

    @NotNull(message = "CUFT is required")
    private double cuft;

    @NotNull(message = "Seats is required")
    private int seats;

    @NotNull(message = "Units is required")
    private int units;

    @NotNull(message = "Pieces is required")    
    private int pieces;

    @NotNull(message = "Inventory Amount is required")
    private double invAmt;

    @NotNull(message = "COD Amount is required")
    private double codAmt;

    @NotNull(message = "Declared Value is required")
    private double decValue;

    @NotNull(message = "FSC Age is required")
    private double fscAge;

    @NotNull(message = "Rate Age is required")
    private double rateAge;

    @NotNull(message = "Discount Age is required")
    private double discAge;

    @NotBlank(message = "Freight is required")
    private String freight;

    @NotNull(message = "PST/GST/HST is required")
    private double pstGstHst;

    @NotNull(message = "Net Total is required")
    private double netTotal;


    
}
