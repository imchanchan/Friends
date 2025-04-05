package com.chan.friends.repository;

import com.chan.friends.model.FriendRoom;
import com.chan.friends.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FriendRoomRepository extends JpaRepository<FriendRoom, Long> {
    List<FriendRoom> findByCreatedBy(User user);
}
