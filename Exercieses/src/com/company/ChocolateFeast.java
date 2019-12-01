package com.company;

public class ChocolateFeast {

    public static void main(String[] args) {
        System.out.println(chocolateFeast(15,3,2));
    }

    static int chocolateFeast(int n, int c, int m) {

        int eaten = n/c;
        int wrappers = n/c;
        while (wrappers>= m){
            wrappers -= m-1;
            eaten++;
        }
        return eaten;
    }

}
