package com.webSocketChatApp.webSocketChatApp.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.webSocketChatApp.webSocketChatApp.chatRoom.ChatRoom;

import java.util.Optional;


public interface ChatRoomRepository extends MongoRepository<ChatRoom, String> {
    Optional<ChatRoom> findBySenderIdAndRecipientId(String senderId, String recipientId);
}