package com.overlanwest.app.models;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "delivery_status")
public class DeliveryStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deliveryStatusId;

    @Column(name = "status")
    private String status;

    @Column(name = "photo_proof")
    private byte[]  photoProof;

    @Column(name = "delivery_date")
    private Date deliveryDate;

    @Column(name = "signature")
    private byte[] signature;

    @Column(name = "consignee")
    private String consignee;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "deliveryStatus", fetch = FetchType.LAZY )
    private List<Pod> pod;
}
