package com.example.bean;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MMenu extends MyEntityM {
    @Id
    @GeneratedValue
    Long idMenu;
}
