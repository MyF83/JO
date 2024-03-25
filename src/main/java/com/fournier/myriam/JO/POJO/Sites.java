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

public class Sites {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long site_id;

    private String site_name;
    private String site_description;
    private String site_address;

    public Sites(String site_name, String site_description, String site_address) {
        this.site_name = site_name;
        this.site_description = site_description;
        this.site_address = site_address;
    }

    public Sites() {
    }

}
