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

public class Countries {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long country_id;
    private String country_name;

    public Countries(String country_name) {
        this.country_name = country_name;
    }

    public Countries() {
    }
}
