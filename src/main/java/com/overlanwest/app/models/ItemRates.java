package com.overlanwest.app.models;

import java.time.LocalDateTime;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "item_rates")
public class ItemRates {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemRateId;
    
    @Column(name ="lnft")
    private double lnft;

    @Column(name = "cuft")
    private double cuft;

    @Column(name = "seats")
    private int seats;

    @Column(name = "units")
    private int units;

    @Column(name = "pieces")
    private int pieces;

    @Column(name = "inv_amt")
    private double invAmt;

    @Column(name = "COD_amt")
    private double codAmt;

    @Column(name = "dec_value")
    private double decValue;

    @Column(name = "fsc_age")
    private double fscAge;

    @Column(name = "rate_age")
    private double rateAge;

    @Column(name = "disc_age")
    private double discAge;

    @Column(name = "freight")
    private String freight;

    @Column(name = "pst_gst_hst")
    private double pstGstHst;

    @Column(name = "net_total")
    private double netTotal;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @OneToOne(mappedBy = "itemRates")
    private Sales sales;

}
