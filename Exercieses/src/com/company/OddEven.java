package com.company;

public class OddEven {

    public static void main(String[] args) {

        System.out.println(isSumOdd(new int[]{1,2,3}));
        System.out.println(isSumOdd(new int[]{1,2,4}));

    }

    public static boolean isSumOdd(int[] arr){

        int sum = 0;
        for(int num : arr){
            sum += num;
        }

        if(sum%2 != 0){
            return true;
        }
        return false;
    }

}
