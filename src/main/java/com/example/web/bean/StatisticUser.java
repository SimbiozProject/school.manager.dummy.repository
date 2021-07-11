package com.example.web.bean;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "statistic_user")
public class StatisticUser {
    @Id
    @JoinColumn(name = "user_chat_id")
    private Long chatId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "chat_id")
    private TgUserTable tgUserTable;

    @Column(name = "active")
    private boolean active;


}
