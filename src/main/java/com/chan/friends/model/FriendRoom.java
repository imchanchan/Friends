package com.chan.friends.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class FriendRoom {
    @Id
    @GeneratedValue
    private Long id;

    private String roomName;

    @ManyToOne
    private User createdBy; // 방 만든 사람

    private LocalDateTime createdAt;
}
