package com.overlanwest.app.models;

import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sales")
public class Sales {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int salesId;

    @Column(name = "accesorial")
    private double accesorial;

    @Column(name = "weight")
    private double weight;

    @Column(name = "rate")
    private double rate;

    @Column(name = "tarrif")
    private double tarrif;

    @Column(name = "shipment_date")
    private LocalDate shipmentDate;

    @Column(name = "currency")
    private String currency;

    @Column(name = "pickup_date")
    private LocalDate pickupDate;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "city_state")
    private String cityState;

    @Column(name = "freight_bill")
    private int freightBill;

    @JoinColumn(name = "customer_id", referencedColumnName = "customerId")
    @ManyToOne
    private Customer customer;

    @JoinColumn(name = "shipper_id", referencedColumnName = "shipperId")
    @ManyToOne
    private Shippers shippers;

    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    @ManyToOne
    private User user;

    @JoinColumn(name = "item_rate_id", referencedColumnName = "itemRateId")
    @OneToOne
    private ItemRates itemRates;

    @OneToOne(mappedBy = "sales")
    private Pod pod;

}
