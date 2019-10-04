package com.company;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1,1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest(){
        System.out.println(this.getName() + " rests");
    }

    private void moveFins(){
        System.out.println(this.getName() + " moves its fins");
    }

    public void swim(int speed){
        moveFins();
        move(speed);
        rest();
    }

    public void setFins(int fins) {
        this.fins = fins;
    }

    public void getFins(){
        System.out.println(this.fins);
    }
}
