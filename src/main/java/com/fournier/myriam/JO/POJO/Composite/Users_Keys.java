package com.fournier.myriam.JO.POJO.Composite;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
public class Users_Keys implements Serializable{

    private Long user_id;
    private String user_key;
    private Long key_id;

     public Users_Keys(Long user_id, String user_key, Long key_id) {
          this.user_id = user_id;
          this.user_key = user_key;
          this.key_id = key_id;
     }

        public Users_Keys() {
        }


}
