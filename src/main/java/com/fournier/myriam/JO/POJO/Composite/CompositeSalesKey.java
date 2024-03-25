package com.fournier.myriam.JO.POJO.Composite;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

//Cette classe est une classe composite qui permet de gérer le fait que la table Sales_Keys possède deux clés primaires (@Id))
//Elle est donc utilisée dans la classe Sales_Keys

@Getter
@Setter
public class CompositeSalesKey implements Serializable{

    private Long sale_id;
    private Long key_id;

    public CompositeSalesKey(Long sale_id, Long key_id){
        this.sale_id = sale_id;
        this.key_id = key_id;
    }

    public CompositeSalesKey(){

    }
}
