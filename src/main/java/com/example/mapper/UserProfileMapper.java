package com.example.mapper;

import com.example.bean.MUserProfile;
import com.example.dto.UserInfoDto;

public class UserProfileMapper {

  public static MUserProfile from(UserInfoDto userInfoDto) {
    return MUserProfile.builder()
        .chatId(userInfoDto.getChatId())
        .userName(userInfoDto.getUserName())
        .build();
  }
}
