package com.example.packagepractice;

public class Series {
    public static int nSum(int n) {
        if (n < 0) {
            return -1;
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        }
    }

    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else {

            int prod = 1;
            for (int i = 1; i <= n; i++) {
                prod *= i;
            }
            return prod;
        }
    }

    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if( n==0){
            return 0;
        }else if(n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
