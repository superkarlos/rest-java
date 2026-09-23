package com.example.demo.model;

import lombok.Data;

@Data 
public class Produto {
    private String name;
    private double price;
    private int quantity;

    public Produto(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
