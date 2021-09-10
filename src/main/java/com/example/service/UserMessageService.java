package com.example.service;

import com.example.bean.MUserPin;
import com.example.common.BotClient;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserMessageService {
    private final List<BotClient> botClientList;

    public void sendPin(MUserPin pin) {
        botClientList.forEach(botClient -> botClient.sendPin(pin));
    }
}
