package com.example.service;

import com.example.bean.MUserPin;
import com.example.bean.MUserProfile;
import com.example.repository.MUserPinRepository;
import com.example.repository.MUserProfileRepository;
import java.util.concurrent.ThreadLocalRandom;
import javax.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final MUserProfileRepository userRepository;
    private final MUserPinRepository pinRepository;
    private final UserMessageService userMessageService;

    public void sendPin(String userName) { // create unit test and mock repo
        MUserProfile user = userRepository.findByUserName(userName)
                .orElseThrow(EntityNotFoundException::new);
        MUserPin pin = generatePin(user);
        sendToUser(pin);
    }

    private MUserPin generatePin(MUserProfile user) {
        var pin = MUserPin.builder()
                .pin((short)ThreadLocalRandom.current().nextInt(1000, 9999))
                .chatId(user.getChatId())
                .build();
        return pinRepository.save(pin); //test MUserPinRepository
    }

    private void sendToUser(MUserPin pin) {
        userMessageService.sendPin(pin);
    }
}
