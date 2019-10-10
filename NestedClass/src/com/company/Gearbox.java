package com.company;

import java.util.ArrayList;

public class Gearbox {
    // Example of innerclass

    private ArrayList<Gear> gears;
    private int maxGears;
    boolean clutchIsIn = false;
//    private int gearNumber=0;
    private int currentGear= 0;

    public Gearbox(int maxGears){
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for(int i=1; i<maxGears; i++){
            addGear(i, i*5.3);
        }
    }

    public void operateClutch(boolean in){
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio){
        if((number>0)&&number<=maxGears){
            this.gears.add(new Gear(number,ratio));
        }
    }

    public void changeGear(int newGear){
        if(newGear >= 0 && newGear<this.gears.size() && clutchIsIn){
            this.currentGear = newGear;
            System.out.println("Gear "+newGear + " selected.");
        } else {
            System.out.println("error");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int rev){
        if(clutchIsIn){
            System.out.println("error");
            return 0.0;
        } else{
            return  rev * gears.get(currentGear).getRatio();
        }
    }

    // Gear is an innerclass, not other class knows about it except for gearbox (encapsualtion)
    private class Gear{
        private int gearNumber;
        private double ratio;

        // to refer to gearNumber in the gearbox need to Gearbox.this.gearNumber but will cause confusion
        public Gear(int gearNumber, double ratio){
            this.gearNumber = gearNumber;
            this.ratio = ratio;

        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs){
            return revs*this.ratio;
        }
    }
}
