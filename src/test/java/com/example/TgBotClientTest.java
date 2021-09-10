package com.example;

import com.example.bean.MUserPin;
import com.example.client.TgBotClient;
import com.example.common.ControllerTest;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.client.RestTemplate;


class TgBotClientTest extends ControllerTest {

    @Autowired
    TgBotClient tgBotClient;
    @MockBean
    RestTemplate restTemplate;


    @Test
    void sendPin() {
        MUserPin pin = new MUserPin();
        tgBotClient.sendPin(pin);
        Mockito.verify(restTemplate).postForObject("https://localhost:8090", pin, Void.class);
    }
}