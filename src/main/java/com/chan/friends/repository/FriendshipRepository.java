package com.chan.friends.repository;

import com.chan.friends.model.Friendship;
import com.chan.friends.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FriendshipRepository extends JpaRepository<Friendship, Long> {
    List<Friendship> findByUser1OrUser2(User user1, User user2);
    boolean existsByUser1AndUser2(User user1, User user2);
}