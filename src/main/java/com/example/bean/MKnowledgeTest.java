package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class MKnowledgeTest extends MyEntityM {
    @Id
    @GeneratedValue
    private Long idKnowledgeTest;
    private String name;

}
