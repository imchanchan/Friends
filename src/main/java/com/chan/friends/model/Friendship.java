package com.chan.friends.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class Friendship {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private User user1;

    @ManyToOne
    private User user2;

    private LocalDateTime connectedAt;
}
