package com.example.web.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "user_answer")
public class UserAnswerTable implements Serializable {


    @Id
    @JoinColumn(name = "user_chat_id")
    private Long chatId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "chat_id")
    private TgUserTable tgUserTable;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "question_id", nullable = false)
    private QuestionAnswerTable questionAnswer;

    @Column(name = "answer")
    private String answer;


}
