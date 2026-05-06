package com.overlanwest.app.dto.lineHaul.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LineHaulResponse {
    
    private String driverName;
    private String driverLastname;
    private String tripStatus;
    private String truckName;
    private String truckDescription;
    private String truckLength;
    private String truckType;
    private String power;
}
