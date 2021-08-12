package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MExercise extends MyEntityM {
    @Id
    @GeneratedValue
    Long idExercise;

    String lessonNumber;
    String linkToSharedDocument;
}
