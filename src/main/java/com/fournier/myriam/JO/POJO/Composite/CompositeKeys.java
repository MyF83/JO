package com.fournier.myriam.JO.POJO.Composite;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

//Cette classe est une classe composite qui permet de gérer le fait que la table Keys possède deux clés primaires (@Id))
//Elle est donc utilisée dans la classe Keys

@Getter
@Setter
public class CompositeKeys implements Serializable {


    private Long key_id;
    private Long key_key;

    public CompositeKeys(Long key_id, Long key_key) {
        this.key_id = key_id;
        this.key_key = key_key;
    }
}
