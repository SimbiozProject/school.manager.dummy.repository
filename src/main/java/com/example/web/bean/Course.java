package com.example.web.bean;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Builder
@AllArgsConstructor
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "courses")
public class Course implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id")
    private Long courseId;

    @Column(name = "course_name")
    private String courseName;



}
