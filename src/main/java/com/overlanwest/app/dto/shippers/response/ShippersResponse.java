package com.overlanwest.app.dto.shippers.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShippersResponse {
    
    private String shipperName;
    private String shipperAddress;
    private int shipperContact;
    private String shipperEmail;

}
