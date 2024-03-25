package com.fournier.myriam.JO.POJO.Composite;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
public class Sales_Keys implements Serializable  {
    private Long sale_id;

    private String sale_key;
    private Long key_id;

    public Sales_Keys(Long sale_id, String sale_key, Long key_id) {
        this.sale_id = sale_id;
        this.sale_key = sale_key;
        this.key_id = key_id;
    }

    public Sales_Keys() {
    }
}
