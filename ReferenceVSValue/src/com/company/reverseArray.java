package com.company;

public class reverseArray {

    public static void reverse(int[] arr){

        for(int i =0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

    }
}
