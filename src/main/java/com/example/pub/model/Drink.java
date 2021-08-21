package com.example.pub.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer"})
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getIsForAdult() {
        return isForAdult;
    }

    public void setIsForAdult(boolean isForAdult) {
        isForAdult = isForAdult;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", isForAdult=" + isForAdult +
                '}';
    }
}
