package com.fournier.myriam.JO.POJO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Keys {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long key_id;

    private String key_key;

    public Keys(String key_key) {
        this.key_key = key_key;

    }

    public Keys() {
    }
}
