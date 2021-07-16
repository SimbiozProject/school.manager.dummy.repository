package com.example.web.bean;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "tg_user")
public class TgUser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user")
    private Long id;

    @Column(name = "user_name", unique = true)
    private String userName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "date_of_birthday")
    private Date dateOfBirthday;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Roles roles;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "course_name")     // insertable=false, updatable=false)
    private Course courseUser;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "group_number") // insertable=false, updatable=false)
    private Group groupUser;

    @Column(name = "block_user")
    private Boolean blockUser;

    @Column(name = "payment")
    private Boolean payment;


}
