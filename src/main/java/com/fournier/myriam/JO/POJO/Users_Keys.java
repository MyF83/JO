package com.fournier.myriam.JO.POJO;

import com.fournier.myriam.JO.POJO.Composite.CompositeUsersKey;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@IdClass(CompositeUsersKey.class)
public class Users_Keys {

    @Id
    private Long user_id;
    @Id
    private String user_key;
    @Id
    private Long key_id;

     public Users_Keys(Long user_id, String user_key, Long key_id) {
          this.user_id = user_id;
          this.user_key = user_key;
          this.key_id = key_id;
     }

        public Users_Keys() {
        }


}
