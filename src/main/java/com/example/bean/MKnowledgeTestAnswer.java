package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class MKnowledgeTestAnswer extends MyEntityM {
    @Id
    @GeneratedValue
    Long idKnowledgeTestAnswer;
    private Long idKnowledgeTest;
    String text;
}
