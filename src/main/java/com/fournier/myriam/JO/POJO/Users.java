package com.fournier.myriam.JO.POJO;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity

public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long user_id;
    private String user_firstname;
    private String user_lastname;
    private String user_email;
    private String user_phone;
    private String user_pwd;
    private LocalDate user_creation_date;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles role_id;




}
