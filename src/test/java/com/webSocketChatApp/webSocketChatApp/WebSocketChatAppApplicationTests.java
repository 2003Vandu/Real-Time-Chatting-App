package com.webSocketChatApp.webSocketChatApp;

import com.webSocketChatApp.webSocketChatApp.Repository.ChatMessageRepository;
import org.junit.jupiter.api.AutoClose;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebSocketChatAppApplicationTests {

    @Autowired
    private ChatMessageRepository repo;
	@Test
	void contextLoads() {
        repo.findByChatId("123");
	}

}
