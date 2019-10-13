package com.example.packagepractice;

import static com.example.packagepractice.Series.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        for(int i =0; i<= 10; i++){
            System.out.println(nSum(i));
        }
        for(int i =0; i<= 10; i++){
            System.out.println(factorial(i));
        }
        for(int i =0; i<= 10; i++){
            System.out.println(fibonacci(i));
        }


    }
}
