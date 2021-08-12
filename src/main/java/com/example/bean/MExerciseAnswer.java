package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MExerciseAnswer extends MyEntityM {
    @Id
    @GeneratedValue
    Long idExerciseAnswer;

    String lessonNumber;
    String linkToSharedDocument;
}
