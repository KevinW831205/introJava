package com.company;

public class barkingDog {

    public static boolean shouldWakeUp (boolean barking, int hourOfDay){
        if(!barking){
            System.out.println(false);
            return false;
        }

        if(hourOfDay>=0 && hourOfDay <= 23){
            if(hourOfDay <8 || hourOfDay>22){
                System.out.println(true);
                return true;
            } else{
                System.out.println(false);
                return false;
            }

        } else {
            System.out.println(false);
            return false;
        }
    }
}
