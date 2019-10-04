package com.company;

public class Car extends Vehicle{

    // 10/01 code

    // State component, fields
//    private int doors;
//    private int wheels;
//    private String model;
//    private String engine;
//    private String color;
////    public int fuel;  public give access to other classes.
//
//    public void setModel(String modelName){
//        String modelInput = modelName.toLowerCase();
//        if(modelInput.equals("compass") || modelInput.equals("cherokee")){
//            this.model = modelInput;
//        } else {
//            this.model="unknown";
//            System.out.println("not a valid model");
//        }
//
//
//    }
//
//    public String getModel(){
//        return this.model;
//    }

    // 19/10/03 code

    private int gears;
    private int wheels;
    private int doors;
    private boolean isManual;
    private int currentGear;

    public Car(String manufacture, String name, int gears, int wheels, int doors, boolean isManual) {
        super(manufacture, name);
        this.gears = gears;
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int gear){
        currentGear = gear;
        System.out.println("Car changed to "+this.currentGear + " gear");
    }

    public void changeVelocity(int speed, int direction){
        move(speed,direction);
    }


}
