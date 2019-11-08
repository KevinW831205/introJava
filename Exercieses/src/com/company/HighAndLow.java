package com.company;

public class HighAndLow {
    public static void main(String[] args) {

        System.out.println(highAndLow("1 2 3"));

    }

    public static String highAndLow(String numbers){

        String[] eachNumber = numbers.split(" ");
        int low =  Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int i =0; i<eachNumber.length; i++){
            int num = Integer.parseInt(eachNumber[i]);
            if(num>high){
                high = num;
            }
            if(num<low){
                low =num;
            }
        }

        return ""+high+" "+low;
    }


}
