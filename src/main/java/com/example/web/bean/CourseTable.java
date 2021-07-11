package com.example.web.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "courses")
public class CourseTable implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id")
    private Long courseId;

    @Column(name = "course_name")
    private String courseName;


   /* @OneToMany(mappedBy = "courseUser", fetch = FetchType.EAGER)
    private Set<TgUserTable> userSet;*/

    @OneToMany(mappedBy = "groupCourse", fetch = FetchType.EAGER)
    private Set<GroupTable> groupSet;

}
