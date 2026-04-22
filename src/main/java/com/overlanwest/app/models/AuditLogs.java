    package com.overlanwest.app.models;

  
import java.time.LocalDateTime;

import jakarta.persistence.Column;
    import jakarta.persistence.Entity;
    import jakarta.persistence.GeneratedValue;
    import jakarta.persistence.GenerationType;
    import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;
    import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.NoArgsConstructor;

    @Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Table(name = "audit_logs")
    public class AuditLogs {
        

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int auditLogsId;

        @Column(name = "method" )
        private String method;

        @Column(name = "end_point")
        private String endPoint;

        @Column(name = "ip_address")
        private String ipAddress;

        @Column(name = "status_code")
        private String statusCode;  

        @Column(name = "created_at")
        private LocalDateTime createdAt;

        @JoinColumn(name = "user_id", referencedColumnName = "userId")
        @ManyToOne
        private User user;

        @JoinColumn(name = "role_id", referencedColumnName = "roleid")
        @ManyToOne
        private Role role;

    }
