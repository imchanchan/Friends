package com.chan.friends.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class RoomInvitation {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private FriendRoom room;

    private String invitedEmail;

    private String verificationCode;

    private boolean isVerified;

    private LocalDateTime sentAt;
}
