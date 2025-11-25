package com.webSocketChatApp.webSocketChatApp.controller;

import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
@Lazy
public class publicController {

    @GetMapping("/health")
    public String healthCheck()
    {
        return "WebSocket is Running ";
    }
}
