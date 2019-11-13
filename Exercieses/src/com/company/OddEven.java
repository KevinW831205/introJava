package com.company;

import static java.util.Arrays.stream;

public class OddEven {

    public static void main(String[] args) {

        System.out.println(isSumOdd(new int[]{1,2,3}));
        System.out.println(isSumOdd(new int[]{1,2,4}));

    }

    public static String isSumOdd(int[] array){

//        int sum = 0;
//        for(int num : array){
//            sum += num;
//        }
//
//        if(sum%2 != 0){
//            return "odd";
//        }
//        return "even";

        return stream(array).sum() % 2 == 0 ? "even" : "odd";
    }

}
