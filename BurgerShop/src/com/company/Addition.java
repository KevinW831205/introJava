package com.company;

public class Addition {
    private double price;
    private String name;

    public Addition(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

class Lettuce extends Addition{
    public Lettuce() {
        super(0.5, "Lettuce");
    }
}
