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

public class Rates {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long rate_id;
    private String rate_title;
    private String rate_description;
    private double rate_price;
    private int rate_nb_spectators;

    public Rates(String rate_title, String rate_description, double rate_price, int rate_nb_spectators) {
        this.rate_title = rate_title;
        this.rate_description = rate_description;
        this.rate_price = rate_price;
        this.rate_nb_spectators = rate_nb_spectators;
    }

    public Rates() {
    }

}
