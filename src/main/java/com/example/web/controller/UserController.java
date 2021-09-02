package com.example.web.controller;

import com.example.web.bean.TgUser;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<TgUser> getUsers() {
        return List.of(
                TgUser.builder().id(1L).userName("max").build(),
                TgUser.builder().id(2L).userName("bax").build(),
                TgUser.builder().id(3L).userName("fax").build(),
                TgUser.builder().id(4L).userName("gax").build(),
                TgUser.builder().id(5L).userName("rax").build(),
                TgUser.builder().id(6L).userName("aax").build());
    }


}
