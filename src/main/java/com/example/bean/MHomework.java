package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MHomework extends MyEntityM {
    @Id
    @GeneratedValue
    Long idHomework;

}
