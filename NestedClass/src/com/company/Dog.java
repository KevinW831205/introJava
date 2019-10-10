package com.company;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    // implementing the abstract methods for the abstract class
    @Override
    public void eat() {
        System.out.println(getName() +" is eating");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is Breathing");
    }
}
