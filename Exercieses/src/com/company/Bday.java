package com.company;

public class Bday {

    public static void main(String[] args) {

        System.out.println(taumBday(10,10,1,2,1));

    }

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        // Write your code here

        long bTotal;
        long wTotal;

        if(wc > bc+z){
            wTotal = (long) w*(bc+z);
        } else {
            wTotal = (long) w*wc;
        }

        if(bc > wc+z ){
            bTotal = (long) b*(wc+z);
        } else {
            bTotal = (long) b*bc;
        }

        return  bTotal + wTotal;
    }

}
