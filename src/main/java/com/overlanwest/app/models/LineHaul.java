package com.overlanwest.app.models;


import java.security.Timestamp;


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

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "line_haul")
public class LineHaul {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lineHaulId;

    @Column(name = "truck_name")
    private String truckName;

    @Column(name = "truck_description")
    private String truckDescription;

    @Column(name = "truck_length")
    private String truckLength;

    @Column(name = "truck_type")
    private String truckType;

    @Column(name = "power")
    private String power;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @JoinColumn(name = "trip_status_id", referencedColumnName = "tripStatusId")
    @ManyToOne
    private TripStatus tripStatus;

    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    @OneToOne
    private User user;

    @OneToOne(mappedBy = "lineHaul")
    private Manifest manifest;

}
