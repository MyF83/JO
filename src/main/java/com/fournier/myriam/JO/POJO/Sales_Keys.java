package com.fournier.myriam.JO.POJO;
import com.fournier.myriam.JO.POJO.Composite.CompositeSalesKey;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@IdClass(CompositeSalesKey.class)
public class Sales_Keys {

    @Id
    private Long sale_id;
    @Id
    private String sale_key;
    @Id
    private Long key_id;

    public Sales_Keys(Long sale_id, String sale_key, Long key_id) {
        this.sale_id = sale_id;
        this.sale_key = sale_key;
        this.key_id = key_id;
    }

    public Sales_Keys() {
    }
}
