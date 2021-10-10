package com.example.service;

import com.example.bean.MUserProfile;
import com.example.repository.MUserProfileRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserProfileService {
  MUserProfileRepository userProfileRepository;

  public MUserProfile saveUser(MUserProfile profile) {
    return userProfileRepository.save(profile);
  }
}
