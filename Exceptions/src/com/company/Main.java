package com.company;

import java.io.IOError;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x =9;
        int y=0;
        System.out.println(divideLBYL(x,y));
        System.out.println(divideEAFP(x,y));
    }

    private static int divideLBYL(int x, int y){
        if(y != 0){
            return x/y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y){
        try{
            return x/y;
        } catch (ArithmeticException e){
            return 0;
        }
    }
}
