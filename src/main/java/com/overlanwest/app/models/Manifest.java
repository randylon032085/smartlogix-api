package com.overlanwest.app.models;


import java.time.LocalDateTime;


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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "manifest")
public class Manifest {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int manifestId;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "time")
    private LocalDateTime time;

    @Column(name = "starting_location")
    private String startingLocation;

    @Column(name = "terminal_destination")
    private String terminalDestination;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    @ManyToOne
    private User user;

    @JoinColumn(name = "line_haul_id", referencedColumnName = "lineHaulId")
    @ManyToOne  
    private LineHaul lineHaul;

    @JoinColumn(name = "pod_id", referencedColumnName = "podId")
    @ManyToOne
    private Pod pod;

    @OneToOne(mappedBy = "manifest")
    private ForceToAssign forceToAssign;

}
