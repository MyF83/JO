package com.fournier.myriam.JO.POJO;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long event_id;

    private LocalDate event_date;

    private String event_description;

    @ManyToOne
    @JoinColumn(name = "sport_id")
    private Sports sport_id;
    @ManyToOne
    @JoinColumn(name = "site_id")
    private Sites site_id;

    @ManyToOne
    @JoinColumn(name = "challenger_id")
    private Challengers challenger_id;

    public Events(LocalDate event_date, String event_description, Sports sport_id, Sites site_id, Challengers challenger_id) {
        this.event_date = event_date;
        this.event_description = event_description;
        this.sport_id = sport_id;
        this.site_id = site_id;
        this.challenger_id = challenger_id;
    }

    public Events() {
    }




}
