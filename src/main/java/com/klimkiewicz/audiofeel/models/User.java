package com.klimkiewicz.audiofeel.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
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
}
