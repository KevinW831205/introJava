package com.company;

public class conversion {


    public static double calcFeetAndInchesToCentimeters(double feet,double inch){
        if(feet<0 || inch>12 || inch<0){
            System.out.println("invalid parameters");
            return -1;
        } else{
            double cm = 0;
            cm += feet*12*2.54 + inch*2.54;
            System.out.println(cm + " cm");
            return cm;
        }
    };

    public static double calcFeetAndInchesToCentimeters(double inch){
        if(inch <0){
            System.out.println("invalid parameters");
            return -1;
        }
        double cm = calcFeetAndInchesToCentimeters(Math.floor(inch/12),inch%12);
        System.out.println("cm "+cm);
        return cm;
    };
}
