package ru.netology.domain;

import java.util.Objects;

public class Smartphone extends Product {
    public String getPhoneManufacturer() {
        return phoneManufacturer;
    }

    public void setPhoneManufacturer(String phoneManufacturer) {
        this.phoneManufacturer = phoneManufacturer;
    }

    private String phoneManufacturer;

    public Smartphone() {
        super();
    }

    public Smartphone(int id, String name, int price, String phoneManufacturer) {
        super(id, name, price);
        this.phoneManufacturer = phoneManufacturer;
    }
}


