package com.example.web.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Data
@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "tg_user")
public class TgUserTable implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "chat_id")
    private Long chatId;

    @OneToOne(mappedBy = "tgUserTable", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private CrmUserTable crmUserTable;

    @OneToOne(mappedBy = "tgUserTable", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private HwFromStudentTable hwFromStudentTable;

    @OneToOne(mappedBy = "tgUserTable", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private UserAnswerTable userAnswerTable;


    @Column(name = "user_name")
    private String userName;

    @Column(name = "active", columnDefinition = "true")
    private Boolean active;

    @Column(name = "role", columnDefinition = "ROLE_USER")
    @Enumerated(EnumType.STRING)
    private UserRoles roles;

    @Column(name = "block_user", columnDefinition = "false")
    private Boolean blockUser;

    @Column(name = "payment", columnDefinition = "false")
    private Boolean payment;



   /* @Column(name = "first_name") - in crm
    private String firstName;

    @Column(name = "last_name") - in crm
    private String lastName;
*/
    /*@Column(name="email", unique = true) - in crm
    private String email;*/


    /*@Column(name = "date_of_birthday") - in crm
    private Date dateOfBirthday;*/


    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "course_name")     // insertable=false, updatable=false)
    private CourseTable courseUser;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "group_number") // insertable=false, updatable=false)
    private GroupTable groupUser;


    @OneToOne(fetch = FetchType.EAGER, mappedBy = "studentName", cascade = CascadeType.REMOVE)
    private HwFromStudentTable fromStudent;

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "userName", cascade = CascadeType.REMOVE)
    private UserAnswerTable usersAnswers;

}
