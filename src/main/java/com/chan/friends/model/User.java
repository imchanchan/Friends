package com.chan.friends.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String email;
    private String username;
    private String password;

    private LocalDateTime createdAt;
}
