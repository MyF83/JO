package com.fournier.myriam.JO.POJO.Composite;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
public class CompositeTicketsKey implements Serializable{

    private Long ticket_id;
    private Long key_id;

    public CompositeTicketsKey(Long ticket_id, Long key_id) {
        this.ticket_id = ticket_id;
        this.key_id = key_id;
    }

    public CompositeTicketsKey() {
    }
}
