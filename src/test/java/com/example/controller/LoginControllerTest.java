package com.example.controller;

import com.example.common.BaseSpringTest;
import com.example.service.LoginService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

class LoginControllerTest extends BaseSpringTest {

    @Autowired
    LoginController loginController;
    @MockBean
    LoginService loginService;

    @Test
    void login() {
        loginController.login("max");

        Mockito.verify(loginService).sendPin("max");
    }
}
