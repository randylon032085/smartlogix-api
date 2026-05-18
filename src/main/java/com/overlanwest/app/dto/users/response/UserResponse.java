package com.overlanwest.app.dto.users.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    

    private String roleName;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}
