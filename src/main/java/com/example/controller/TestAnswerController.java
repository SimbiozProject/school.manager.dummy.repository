package com.example.controller;

import com.example.bean.TestAnswer;
import com.example.repository.TestAnswerRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestAnswerController {
  private final TestAnswerRepository testAnswerRepository;

  @GetMapping("test-answer")
  public Page<TestAnswer> findAll(Pageable pageable) {
    return testAnswerRepository.findAll(pageable);
  }
}
