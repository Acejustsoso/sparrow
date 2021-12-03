package com.sparrow.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "USER_INFO_LIST")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String sss;
    private String eee;
}