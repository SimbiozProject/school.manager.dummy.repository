package com.example.dto;

import com.example.bean.MUserProfile;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HelloMessageDto {
    private MUserProfile userProfile;
    private String message;
}
