package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MUserProfile extends MyEntityM {
    @Id
    @GeneratedValue
    Long idUserProfile;

}
