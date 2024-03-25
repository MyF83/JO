package com.fournier.myriam.JO.POJO.Composite;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

//Cette classe est une classe composite qui permet de gérer le fait que la table Users_Keys possède deux clés primaires (@Id))
//Elle est donc utilisée dans la classe Users_Keys

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
