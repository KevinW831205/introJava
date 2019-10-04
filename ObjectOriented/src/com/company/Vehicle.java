package com.company;

public class Vehicle {

    private String manufacture;
    private String name;
    private int speed;
    private int direction = 0;

    public Vehicle(String manufacture, String name) {
        this.manufacture = manufacture;
        this.name = name;
        this.speed = 0;
        this.direction=0;
    }

    public void move(int speed, int direction){
        this.speed = speed;
        this.direction = direction;
        System.out.println("Vehicle moving at "+this.speed+" speed in " + this.direction);
    }

    public void steer(int direction){
        this.direction += direction;
        System.out.println("Vehicle steering at "+this.direction+" degrees.");
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDirection() {
        return direction;
    }

    public void stop(){
        this.speed=0;
    }
}
