package com.fournier.myriam.JO.POJO;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Tickets {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long ticket_id;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offers offer_id;

    @ManyToOne
    @JoinColumn(name = "cerem_id")
    private Ceremonies cerem_id;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Events event_id;

    @ManyToOne
    @JoinColumn(name = "rate_id")
    private Rates rate_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user_id;

    @ManyToOne
    @JoinColumn(name = " sale_id")
    private Sales sale_id;

    @ManyToOne
    @JoinColumn(name = "key_id")
    private Keys key_id;

    public Tickets(Offers offer_id, Ceremonies cerem_id, Events event_id, Rates rate_id, Users user_id, Sales sale_id, Keys key_id) {
        this.offer_id = offer_id;
        this.cerem_id = cerem_id;
        this.event_id = event_id;
        this.rate_id = rate_id;
        this.user_id = user_id;
        this.sale_id = sale_id;
        this.key_id = key_id;
    }

    public Tickets() {
    }

}
