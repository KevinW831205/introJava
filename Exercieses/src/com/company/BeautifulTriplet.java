package com.company;

import java.util.Enumeration;

public class BeautifulTriplet {

    public static void main(String[] args) {

        System.out.println( beautifulTriplets(1,new int[]{2,2,3,4,5}) + " expected 3");
        System.out.println(beautifulTriplets(3,new int[]{1,2,4,5,7,8,10}) + " expected 3");

    }



    static int beautifulTriplets(int d, int[] arr) {

        int numberOfTriplets = 0;

        for(int i =0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] -arr[i] == d){
                    for(int k = j+1; k<arr.length; k++){
                        if(arr[k] - arr[j] == d){
                            numberOfTriplets++;
                        }
                    }
                }
            }

        }

        return numberOfTriplets;
    }




}
