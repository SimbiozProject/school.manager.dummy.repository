package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MKnowledgeTestAnswer extends MyEntityM {
    @Id
    @GeneratedValue
    Long idKnowledgeTestAnswer;
    String text;
}
