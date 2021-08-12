package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MLesson extends MyEntityM {
    @Id
    @GeneratedValue
    Long idLesson;
}
