package com.overlanwest.app.dto.fleetAssignment.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FleetAssignmentResponse {
    

    private String driver;

    //linehaul details
    private String power;
    private String truckType;
    private String truckDecription;

    //trailer details
    private String length;
    private String trailerDescription;

    //trip status details
    private String status;

}
