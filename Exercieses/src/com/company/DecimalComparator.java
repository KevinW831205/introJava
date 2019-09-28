package com.company;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        int num1 = (int) (a*1000d);
        int num2 = (int) (b*1000d);

        System.out.println(num1 +" "+num2);

        if(num1 == num2){
            return true;
        }
        return false;
    }
}
