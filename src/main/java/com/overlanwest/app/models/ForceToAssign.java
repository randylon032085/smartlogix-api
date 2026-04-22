package com.overlanwest.app.models;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "force_to_assign")
public class ForceToAssign {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int forceToAssignId;

    @Column(name = "reason")
    private String reason;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @JoinColumn(name = "manifest_id", referencedColumnName = "manifestId" )
    @OneToOne
    private Manifest manifest;

    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    @OneToOne
    private User fromDriver;

    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    @OneToOne
    private User toDriver;
}
