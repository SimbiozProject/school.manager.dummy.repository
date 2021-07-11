package com.example.web.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "crm_registration")
public class CrmUserTable implements Serializable {

    @Id
    @JoinColumn(name = "user_chat_id")
    private Long chatId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "chat_id")
    private TgUserTable tgUserTable;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "e_mail")
    private String eMail;

}