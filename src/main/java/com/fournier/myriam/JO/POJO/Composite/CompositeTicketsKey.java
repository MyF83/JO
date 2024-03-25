package com.fournier.myriam.JO.POJO.Composite;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

//Cette classe est une classe composite qui permet de gérer le fait que la table Tickets_Keys possède deux clés primaires (@Id))
//Elle est donc utilisée dans la classe Tickets_Keys

@Getter
@Setter
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
