package com.fournier.myriam.JO.POJO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
public class Offers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long offer_id;
    private String offer_title;

    private String offer_description;

    private double offer_price;

    @ManyToOne
    @JoinColumn (name = "cerem_id")
    private Ceremonies cerem_id;

    @ManyToOne
    @JoinColumn (name = "event_id")
    private Events event_id;

    @ManyToOne
    @JoinColumn (name = "rate_id")
    private Rates rate_id;

    @ManyToOne
    @JoinColumn (name = "user_id")
    private Users user_id;

    public Offers(String offer_title, String offer_description, double offer_price, Ceremonies cerem_id, Events event_id, Rates rate_id, Users user_id) {
        this.offer_title = offer_title;
        this.offer_description = offer_description;
        this.offer_price = offer_price;
        this.cerem_id = cerem_id;
        this.event_id = event_id;
        this.rate_id = rate_id;
        this.user_id = user_id;
    }

    public Offers() {
    }

}
