package com.company;

public class HalloweenSale {

    public static void main(String[] args) {
        System.out.println(howManyGames(20,3,6,80) +" expected 6");
        System.out.println(howManyGames(20,3,6,85) +" expected 7");

    }

    static int howManyGames(int p, int d, int m, int s) {

        int result = 0;
        int currentPrice = p;
        while(s>0){

            if(s> currentPrice){
                s -= currentPrice;
                result++;
                if(currentPrice > m){
                    if(currentPrice - d <m){
                        currentPrice = m;
                    } else {
                        currentPrice -= d;
                    }
                }
            } else {
                return result;
            }
        }

        return result;

    }


}
