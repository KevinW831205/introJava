package com.company;

public class Bday {

    public static void main(String[] args) {

        System.out.println(taumBday(10,10,1,1,1));

    }

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        // Write your code here

        int bTotal;
        int wTotal;

        if(wc > bc+z){
            wTotal = w*(bc+z);
        } else {
            wTotal = w*wc;
        }

        if(bc>wc+z){
            bTotal = b*(wc+z);
        } else {
            bTotal = b*bc;
        }

        return  (long) bTotal + wTotal;
    }

}
