package com.example.client;

import com.example.bean.MUserPin;
import com.example.common.BotClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component
@RequiredArgsConstructor
public class TgBotClient implements BotClient {
    private final RestTemplate restTemplate;

    public void sendPin(MUserPin pin) {
        log.info("Send pin: {}", pin);
//        restTemplate.postForObject("http://localhost:8090/pin", pin, Void.class);
    }
}
