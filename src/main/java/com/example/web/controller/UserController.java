package com.example.web.controller;

import com.example.web.bean.TgUserTable;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<TgUserTable> getUsers() {
        return List.of(
                TgUserTable.builder().id(1L).userName("max").build(),
                TgUserTable.builder().id(2L).userName("bax").build(),
                TgUserTable.builder().id(3L).userName("fax").build(),
                TgUserTable.builder().id(4L).userName("gax").build(),
                TgUserTable.builder().id(5L).userName("rax").build(),
                TgUserTable.builder().id(6L).userName("aax").build());
    }
}
