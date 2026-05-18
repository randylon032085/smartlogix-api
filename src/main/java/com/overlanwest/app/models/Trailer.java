package com.overlanwest.app.models;

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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "trailer")
public class Trailer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int trailerId;

    @Column(name = "length")
    private String length;

    @Column(name = "trailer_desc")
    private String trailerDesc;

    @Column(name = "created_at")
    private String createdAt;   

    @Column(name = "updated_at")
    private String updatedAt;

    @OneToMany(mappedBy = "trailer", fetch = FetchType.LAZY)
    private List<FleetAssignment> fleetAssignments;
}
