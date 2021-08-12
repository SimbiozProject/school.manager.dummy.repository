package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MProfileRole extends MyEntityM {
    @Id
    @GeneratedValue
    Long idProfileRole;
}
