package com.company;

public class HalloweenSale {

    public static void main(String[] args) {
        System.out.println(howManyGames(20,3,6,80) +" expected 6");
        System.out.println(howManyGames(20,3,6,85) +" expected 7");

    }

    static int howManyGames(int p, int d, int m, int s) {

        int count = 0;
        while (s>=p){
            count++;
            s-=p;
            p=Math.max(p-d,m);
        }
        return count

    }


}
