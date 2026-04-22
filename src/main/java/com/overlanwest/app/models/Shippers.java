package com.overlanwest.app.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "shippers")
public class Shippers {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private int shipperId;


    @Column(name = "shipper_name")
    private String shipperName;

    @Column(name = "shipper_address")
    private String shipperAddress;

    @Column(name = "shipper_contact")
    private int shipperContact;

    @Column(name = "shipper_email")
    private String shipperEmail;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "shippers")
    private List<Sales> sales;
}
