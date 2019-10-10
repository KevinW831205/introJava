package com.company;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // abstract methods that needs to be implemented
    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
