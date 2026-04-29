package com.overlanwest.app.dto.auditLogs.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuditLogs {
    
    private String username;
    private String roleName;
    private String method;
    private String endPoint;
    private String ipAddress;
    private String statusCode;
    private LocalDateTime createdAt;
    
}
