package com.example.web.bean;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Data
@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "question_answer")
public class QuestionAnswerTable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "question")
    private String question;

    @Column(name = "first_answer")
    private String firstAnswer;

    @Column(name = "second_answer")
    private String secondAnswer;

    @Column(name = "third_answer")
    private String thirdAnswer;

    @Column(name = "fourth_answer")
    private String fourthAnswer;

    @Column(name = "right_answer")
    private String rightAnswer;

    @OneToMany(mappedBy = "questionAnswer", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<UserAnswerTable> answerFromUser;

    public QuestionAnswerTable(String question, String firstAnswer, String secondAnswer, String thirdAnswer, String fourthAnswer, String rightAnswer) {
        this.question = question;
        this.firstAnswer = firstAnswer;
        this.secondAnswer = secondAnswer;
        this.thirdAnswer = thirdAnswer;
        this.fourthAnswer = fourthAnswer;
        this.rightAnswer = rightAnswer;
    }
}
