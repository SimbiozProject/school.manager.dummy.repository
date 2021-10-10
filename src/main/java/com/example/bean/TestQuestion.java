package com.example.bean;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TestQuestion extends MyEntityM{
  @Id
  @GeneratedValue
  Long id;
  private String question;
  private Long testId;
  @OneToMany(cascade = CascadeType.ALL)
  private List<TestAnswer> answerList;
}
