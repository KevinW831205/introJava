package com.company;

public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays (long minutes){
        if(minutes <0 ){
            System.out.println("Invalid Value");
        } else {
            long year = (long) Math.floor(minutes / 525600);
            long day = (long) Math.floor( (minutes % 525600) / 1440);


            System.out.println(minutes+" min = "+year+" y and "+ day + " d");
        }

    }
}
