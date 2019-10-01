package com.company;

public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number<2){
            return -1;
        }

        int largestPrime = -1;

        for(int i =2; i<= number; i++){


            boolean iIsPrime = true;

            for(int j =2; j<=i/2; j++){
                if(i%j == 0){
                    iIsPrime = false;
                }
            }

            System.out.println(i);
            System.out.println("isprime" + iIsPrime);
            if(number%i == 0 && iIsPrime){
                largestPrime = i;
            }

        }

        return largestPrime;

    }




}
