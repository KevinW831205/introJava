package com.company;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); // defining the extends class
        this.eyes = eyes;
        this.tail = tail;
        this.legs = legs;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println(this.getName() +" is chewing");
    }

    @Override
    public void eat() {
        super.eat();
        this.chew();
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog is moving it's legs");
        super.move(speed);
    }

    // using super will always use the inherited method and ignore the the overidden method

    public void walk(){
        System.out.println("Dog is walking");
        move(1);
    }

    public void run(){
        System.out.println("Dog is running");
        super.move(2);
    }

    public void bark() {
        System.out.println("woof");
    }
}
