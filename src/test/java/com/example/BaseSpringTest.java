package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


@SpringBootTest
@ActiveProfiles(value = "dev")
public class BaseSpringTest {

    @Value("${server.port}")
    int port;

    @Test
    void setup() {
        System.out.println(port);
    }
}
