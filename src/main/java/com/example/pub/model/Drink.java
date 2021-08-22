package com.example.pub.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Getter
@Setter
@ToString
public class Drink {

    @Id
    @SequenceGenerator(
            name = "drink_sequence",
            sequenceName = "drink_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "drink_sequence"
    )

    private Long id;
    private String productName;
    private int price;
    private boolean isForAdult;


    public Drink() {
    }

    public Drink(String productName, int price, boolean isForAdult) {
        this.productName = productName;
        this.price = price;
        this.isForAdult = isForAdult;
    }


}
