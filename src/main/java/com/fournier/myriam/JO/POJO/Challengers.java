package com.fournier.myriam.JO.POJO;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
public class Challengers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long challenger_id;
    private String challenger_name;

    @ManyToOne
    @JoinColumn (name = "country_id")
    private Countries country_id;

    public Challengers(String challenger_name, Countries country_id) {
        this.challenger_name = challenger_name;
        this.country_id = country_id;
    }

    public Challengers() {
    }
}
