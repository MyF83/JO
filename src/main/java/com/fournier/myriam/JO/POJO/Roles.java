package com.fournier.myriam.JO.POJO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity

public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long role_id;
    private String role_name;
    private String role_description;

    public Roles(String role_name, String role_description) {
        this.role_name = role_name;
        this.role_description = role_description;
    }

    public Roles() {
    }

}
