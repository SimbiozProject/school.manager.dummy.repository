package com.example.bean;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class MyEntityM {
    @Column(insertable = false, updatable = false)
    Instant created;
}
