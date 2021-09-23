package com.example.bean;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public class MyEntityM {

    @Column(insertable = false, updatable = false)
    Instant created;
}
