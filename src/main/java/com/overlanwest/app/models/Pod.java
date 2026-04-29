package com.overlanwest.app.models;

import java.security.Timestamp;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pod")
public class Pod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int podId;

    @Column(name = "pod_number")
    private String podNumber;
    
    @Column(name = "created_at")
    private Timestamp createAt;

    @Column(name = "updated_at")
    private Timestamp updateAt;

    @JoinColumn(name = "sales_id", referencedColumnName = "salesId")
    @OneToOne
    private Sales sales;

    @JoinColumn(name = "delivery_status_id", referencedColumnName = "deliveryStatusId")
    @ManyToOne
    private DeliveryStatus deliveryStatus;

    @OneToMany(mappedBy = "pod")
    private List<Manifest> manifests;
}
