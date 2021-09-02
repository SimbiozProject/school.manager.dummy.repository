package com.example.controller;

import com.example.common.ControllerTest;
import org.junit.jupiter.api.Test;

class LoginControllerIntTest extends ControllerTest {



    @Test
    void login() throws Exception {
        performGet("/login/maxim");
    }

    @Test
    void unitTestLogin() {

    }
}