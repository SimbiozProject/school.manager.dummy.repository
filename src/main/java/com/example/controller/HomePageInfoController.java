package com.example.controller;

import com.example.bean.MUserProfile;
import com.example.dto.HelloMessageDto;
import com.example.dto.UserInfoDto;
import com.example.mapper.UserProfileMapper;
import com.example.service.HelloService;
import com.example.service.UserProfileService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class HomePageInfoController {

  UserProfileService userProfileService;
  HelloService helloService;

  @PostMapping("/home-page")
  public HelloMessageDto homePage(@RequestBody UserInfoDto userInfoDto) {
    MUserProfile user = userProfileService.saveUser(UserProfileMapper.from(userInfoDto));
    String message = helloService.helloMessage();
    return new HelloMessageDto(user, message);
  }
}
