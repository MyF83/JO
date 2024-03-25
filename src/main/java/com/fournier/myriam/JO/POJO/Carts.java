package com.fournier.myriam.JO.POJO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Carts {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)

        private Long cart_id;
        private String cart_articles;

        @ManyToOne
        @JoinColumn (name = "user_id")
        private Users user_id;

        public Carts(String cart_articles, Users user_id) {
            this.cart_articles = cart_articles;
            this.user_id = user_id;
        }

        public Carts() {
        }
}
