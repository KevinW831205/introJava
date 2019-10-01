package com.company;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second){
        if(first <10 || second<10 ){
            return -1;
        }

        int divisor = 0;
        int greatestDivisor = 0;

        int smaller =first;
        if(second < first){
            smaller = second;
        }

        while (divisor<=smaller){
            divisor++;
            if(first%divisor == 0 && second%divisor ==0){
                greatestDivisor= divisor;
            }
        }
        return greatestDivisor;


    }
}
