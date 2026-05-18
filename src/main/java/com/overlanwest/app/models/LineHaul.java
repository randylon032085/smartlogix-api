package com.overlanwest.app.models;
import java.time.LocalDateTime;
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
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "line_haul")
public class LineHaul {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lineHaulId;

    @Column(name = "truck_name")
    private String truckName;

    @Column(name = "truck_description")
    private String truckDescription;

    @Column(name = "truck_type")
    private String truckType;

    @Column(name = "power")
    private String power;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

   

    @OneToMany(mappedBy = "lineHaul", fetch = FetchType.LAZY)
    private List<FleetAssignment> fleetAssignments;

}
