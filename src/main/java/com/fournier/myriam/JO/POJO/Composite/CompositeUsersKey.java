package com.fournier.myriam.JO.POJO.Composite;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CompositeUsersKey implements Serializable {

        private Long user_id;
        private Long key_id;

        public CompositeUsersKey(Long user_id, Long key_id) {
            this.user_id = user_id;
            this.key_id = key_id;
        }

        public CompositeUsersKey() {
        }
}
