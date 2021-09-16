package com.example.bean;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class MKnowledgeTestQuestion extends MyEntityM {
    @Id
    @GeneratedValue
    Long idKnowledgeTestQuestion;
    private Long idKnowledgeTest;
    String text;
}
