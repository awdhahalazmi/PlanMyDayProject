package com.MyDayPlanner.PlanMyDay.entity;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class UserEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @OneToOne
    @JoinColumn(name = "role_id")
    private RoleEntity role;

    @Column(nullable = false)
    private String password;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "email", nullable = false)

    private String email;


    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


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


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}



