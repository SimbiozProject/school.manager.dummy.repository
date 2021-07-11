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
@Table(name = "student_group")
public class GroupTable  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "group_id")
    private Long groupId;

    @Column(name = "group_number")
    private Long groupNumber;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="course_id")   // insertable=false, updatable=false)
    private CourseTable groupCourse;

    @OneToMany(mappedBy = "groupUser", fetch = FetchType.EAGER)
    private Set<TgUserTable> tgUserSet;

    @OneToMany(mappedBy = "groupHwForStudents", fetch = FetchType.EAGER)
    private Set<HwForStudentTable> studentHw;
}

