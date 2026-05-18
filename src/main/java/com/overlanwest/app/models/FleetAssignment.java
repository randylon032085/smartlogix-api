package com.overlanwest.app.models;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "fleet_assignment")
public class FleetAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fleetAssignmentId;

    @JoinColumn(name = "line_haul_id", referencedColumnName = "lineHaulId") 
    @ManyToOne
    private LineHaul lineHaul;

    @JoinColumn(name = "trailer_id", referencedColumnName = "trailerId")
    @ManyToOne
    private Trailer trailer;

    @JoinColumn(name = "driver_id", referencedColumnName = "userId")
    @ManyToOne
    private User driver;

    @JoinColumn(name = "trip_status_id", referencedColumnName = "tripStatusId")
    @ManyToOne
    private TripStatus tripStatus;

}
