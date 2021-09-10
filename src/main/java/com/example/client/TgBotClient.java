package com.example.client;

import com.example.bean.MUserPin;
import com.example.common.BotClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class TgBotClient implements BotClient {
    private final RestTemplate restTemplate;

    public void sendPin(MUserPin pin) {
        restTemplate.postForObject("http://localhost:8090/pin", pin, Void.class);
    }
}
