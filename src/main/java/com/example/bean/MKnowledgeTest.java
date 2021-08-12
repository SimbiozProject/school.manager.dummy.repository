package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MKnowledgeTest extends MyEntityM {
    @Id
    @GeneratedValue
    Long idKnowledgeTest;

    String name;

}
