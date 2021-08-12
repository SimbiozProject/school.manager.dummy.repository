package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class MCourse extends MyEntityM {
    @Id
    @GeneratedValue
    Long idCourse;

    String courseName;
}
