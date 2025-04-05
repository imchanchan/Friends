package com.chan.friends.repository;

import com.chan.friends.model.FriendRoom;
import com.chan.friends.model.RoomInvitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoomInvitationRepository extends JpaRepository<RoomInvitation, Long> {
    Optional<RoomInvitation> findByInvitedEmailAndVerificationCode(String invitedEmail, String verificationCode);
    List<RoomInvitation> findByRoom(FriendRoom room);
}
