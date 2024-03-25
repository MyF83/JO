package com.fournier.myriam.JO.POJO;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Sports {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sport_id;
    private String sport_name;
    private String sport_description;
    private Boolean sport_is_paralymp;

    @ManyToOne
    @JoinColumn (name = "site_id")
    private Sites site_id;

public Sports(String sport_name, String sport_description, Boolean sport_is_paralymp, Sites site_id) {
        this.sport_name = sport_name;
        this.sport_description = sport_description;
        this.sport_is_paralymp = sport_is_paralymp;
        this.site_id = site_id;
    }

    public Sports() {
    }
}
