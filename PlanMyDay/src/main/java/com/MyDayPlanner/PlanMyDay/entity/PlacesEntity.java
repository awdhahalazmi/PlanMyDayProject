package com.MyDayPlanner.PlanMyDay.entity;

import javax.persistence.*;

@Entity
@Table(name = "Places")
public class PlacesEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "details", nullable = false)
    private String details;
    @Enumerated(EnumType.STRING)
    @OneToOne
    @JoinColumn(name = "role_id")
    private RoleEntity role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }
}
