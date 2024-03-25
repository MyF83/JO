package com.fournier.myriam.JO.POJO;
import com.fournier.myriam.JO.POJO.Composite.CompositeTicketsKey;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@IdClass(CompositeTicketsKey.class)
public class Tickets_Keys {

    @Id
    private Long ticket_id;
    @Id
    private String ticket_key;
    @Id
    private Long key_id;

    public Tickets_Keys(Long ticket_id, String ticket_key, Long key_id) {
        this.ticket_id = ticket_id;
        this.ticket_key = ticket_key;
        this.key_id = key_id;
    }

    public Tickets_Keys() {
    }
}
