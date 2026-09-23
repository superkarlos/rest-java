package com.example.demo.model;

import lombok.Data;

@Data 
public class Cliente {
    private String name;
    private String email;
    private String phone;
    private boolean isActive = false;

    public Cliente(String name, String email, String phone, boolean isActive) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.isActive = isActive;
    }

}
