package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Ford ford1 = new Ford();
        ford1.accelerate();
        Mitsubishi m1 = new Mitsubishi();
        Car car1 = new Car("somecar","some engine",4,4);
        car1.startEngine();
        m1.startEngine();
        ford1.startEngine();

    }

}

class Car {
    private String name;
    private String engine;
    private int cylinders;
    private int wheels;
    private boolean engineStarted;
    private int speed;

    public Car(String name, String engine, int cylinders, int wheels) {
        this.name = name;
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = wheels;
        this.engineStarted = false;
        this.speed = 0;

    }

    public void startEngine(){
        this.engineStarted = true;
        System.out.println("Engine has started");
    }

    public void accelerate(int acceleration){
        if(acceleration >0){
            speed += acceleration;
            System.out.println("accelerated "+ acceleration+ " current speed: "+this.speed);
        } else {
            System.out.println("Invalid acceleration value");
        }
    }

    public void breakCar(){
        speed -= 20;
        if(speed<0){
            speed = 0;
            System.out.println(name + " has come to a stop");
        } else {
            System.out.printf(name + "hit break, current speed "+ speed);
        }
    };

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    public int getSpeed() {
        return speed;
    }
}

class Ford extends Car{
    public Ford() {
        super("ford", "EV8", 8, 4);
    }

    @Override
    public void startEngine() {
        System.out.println("Ford started Engine");
    }

    public void accelerate(){
        accelerate(30);
    }
}

class Mitsubishi extends Car{
    public Mitsubishi() {
        super("Mitsubishi","EV6",6,4);
    }

    @Override
    public void startEngine() {
        System.out.println("Mitsubishi started Engine");
    }

}


