package com.fournier.myriam.JO.POJO;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Ceremonies {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long cerem_id;
    private String cerem_name;

    private String cerem_description;

    private String cerem_siteName;

    private LocalDate cerem_date;

    @ManyToOne
    @JoinColumn(name = "site_id")
    private Sites site_id;

    public Ceremonies(String cerem_name, String cerem_description, String cerem_siteName, LocalDate cerem_date, Sites site_id) {
        this.cerem_name = cerem_name;
        this.cerem_description = cerem_description;
        this.cerem_siteName = cerem_siteName;
        this.cerem_date = cerem_date;
        this.site_id = site_id;
    }

    public Ceremonies() {
    }
}
