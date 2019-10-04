package com.company;

public class SUV extends Car {
    private String model;

    public SUV(String manufacture, String name, int gears, boolean isManual, String model) {
        super(manufacture, name, 5, 5,5, isManual);
        this.model = model;
    }

    public void accelerate(int rate){
        int newVelocity = getSpeed() + rate;
        if(newVelocity <= 0){
            stop();
            changeGear(1);
        } else if(newVelocity>0 && newVelocity<= 10){
            changeGear(1);
        } else if(newVelocity>10 && newVelocity<= 20){
            changeGear(2);
        }else if(newVelocity>20 && newVelocity<= 30){
            changeGear(3);
        }else if(newVelocity>40 && newVelocity<= 50){
            changeGear(4);
        }else if(newVelocity>50){
            changeGear(5);
        }

        if(newVelocity >0){
            changeVelocity(newVelocity, getDirection());
        }
    }

}
