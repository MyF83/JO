package com.fournier.myriam.JO.POJO;

import com.fournier.myriam.JO.POJO.Composite.CompositeKeys;
import com.fournier.myriam.JO.POJO.Composite.CompositeSalesKey;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@IdClass(CompositeKeys.class)
public class Keys {
    @Id
    private Long key_id;

    @Id
    private String key_key;

    public Keys(String key_key) {
        this.key_key = key_key;

    }

    public Keys() {
    }
}
