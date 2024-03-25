package com.fournier.myriam.JO.POJO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity

public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sale_id;
    private LocalDate sale_date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user_id;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offers offer_id;

    @ManyToOne
    @JoinColumn(name = "key_id")
    private Keys key_id;

    public Sales(LocalDate sale_date, Users user_id, Offers offer_id, Keys key_id) {
        this.sale_date = sale_date;
        this.user_id = user_id;
        this.offer_id = offer_id;
        this.key_id = key_id;
    }

    public Sales() {
    }
}
