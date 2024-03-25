package com.fournier.myriam.JO.POJO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Controls {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long control_id;
    private String control_scancode;
    private LocalDate control_date;

    private Boolean control_is_OK;

    @ManyToOne
    @JoinColumn(name = "key_id")
    private Keys key_id;

    @ManyToOne
    @JoinColumn(name = "ticket_key")
    private Tickets ticket_key;
    @ManyToOne
    @JoinColumn(name = "user_key")
    private Users user_key;

    @ManyToOne
    @JoinColumn(name = "sale_key")
    private Sales sale_key;

    public Controls(String control_scancode, LocalDate control_date, Boolean control_is_OK, Keys key_id, Tickets ticket_key, Users user_key, Sales sale_key) {
        this.control_scancode = control_scancode;
        this.control_date = control_date;
        this.control_is_OK = control_is_OK;
        this.key_id = key_id;
        this.ticket_key = ticket_key;
        this.user_key = user_key;
        this.sale_key = sale_key;
    }

    public Controls() {
    }
}
