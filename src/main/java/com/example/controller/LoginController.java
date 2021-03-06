package com.example.controller;

import com.example.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @GetMapping("/login/{userName}")
    public void login(@PathVariable String userName) {
        loginService.sendPin(userName); // unit test
    }

    @PostMapping("/login/{userName}")
    public void pin(@PathVariable String userName, @RequestBody String pin) {
        loginService.verifyPinForUser(userName, pin); // unit test
    }
}
