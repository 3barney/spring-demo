package com.test.demo.entities;


import jakarta.persistence.*;

import java.time.ZonedDateTime;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String idNumber;

    @Column
    private ZonedDateTime createdAt;

    @Column
    private ZonedDateTime updatedAt;

}
