package com.company;

public class PrimeNumber {



    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }

    public static void ThreePrimeInRange(int lower, int upper){
        int count = 0;

        for(int i = lower; i<=upper; i++ ){
            if(isPrime(i)){
                System.out.println(i);
                count++;
            }

            if(count == 3){
                System.out.println("Exit");
                break;
            }
        }

    }

}
