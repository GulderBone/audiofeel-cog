package com.klimkiewicz.audiofeel.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String password;
    @Column(columnDefinition = "BOOLEAN DEFAULT true")
    private boolean active;
    @Column(columnDefinition = "VARCHAR(80) DEFAULT 'ROLE_USER'")
    private String roles;

    public User() {
        this.active = true;
        this.roles = "ROLE_USER";
    }
}
