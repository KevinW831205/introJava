package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Gearbox gb1 = new Gearbox(6);
        Gearbox.Gear gear1 = gb1.new Gear(1,12.3);
        System.out.println(gear1.driveSpeed(30));

        Gearbox.Gear gear2 = gb1.new Gear(2,15.8);



    }
}
