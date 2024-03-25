package com.fournier.myriam.JO.POJO.Composite;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter

public class Tickets_Keys implements Serializable {
    private Long ticket_id;
    private String ticket_key;
    private Long key_id;

    public Tickets_Keys(Long ticket_id, String ticket_key, Long key_id) {
        this.ticket_id = ticket_id;
        this.ticket_key = ticket_key;
        this.key_id = key_id;
    }

    public Tickets_Keys() {
    }
}
