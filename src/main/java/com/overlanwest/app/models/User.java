package com.overlanwest.app.models;

import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @JoinColumn(name = "role_id", referencedColumnName = "roleid")
    @ManyToOne
    private Role role;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "user")
    private List<AuditLogs> auditLogs;

    @OneToMany(mappedBy = "user")
    private List<Sales> sales;

    @OneToOne(mappedBy = "user")
    private LineHaul lineHaul;

    @OneToMany(mappedBy = "user")
    private List<Manifest> manifest;

    @OneToOne(mappedBy = "fromDriver")
    private ForceToAssign forceToAssignFrom;

    @OneToOne(mappedBy = "toDriver")
    private ForceToAssign forceToAssignTo;
    

    
}
