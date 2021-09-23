package com.example.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TestAnswer {
  @Id
  @GeneratedValue
  private Long id;
  private String answer;
  private boolean isCorrect;
  @ManyToOne
  private TestQuestion testQuestion;
}


