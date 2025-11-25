package com.webSocketChatApp.webSocketChatApp.Repository;

import com.webSocketChatApp.webSocketChatApp.Enum.Status;
import com.webSocketChatApp.webSocketChatApp.user.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository  extends MongoRepository<User, String> {
    List<User> findAllByStatus(Status status);
}
