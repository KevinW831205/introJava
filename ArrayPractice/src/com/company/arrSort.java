package com.company;


import java.util.Scanner;

public class arrSort {



    public static int[] getArr(){
        int integersToGet = -1;

        integersToGet = getNumberOfInt();

        while (integersToGet<=1){
            System.out.println("Invalid Input. Enter Integer greater than 2");
            integersToGet = getNumberOfInt();
        }

        int[] intArr = new int[integersToGet];

        for(int i =0 ; i<intArr.length; i++){
            System.out.println("Enter an integer" + (i + 1));
            intArr[i] = getInteger();
        }

        return intArr;
    }

    public static int getInteger(){
        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            return scanner.nextInt();
        } else {
            System.out.println("Invalid Input");
            getInteger();
        }

        return -1;
    }

    public static int getNumberOfInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of integers");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            return scanner.nextInt();
        } else {
            System.out.println("Invalid Input");
            getNumberOfInt();
        }
        return -1;
    }

    public static int[] mySort(int[] arr){
        boolean sorted = false;

        while (!sorted){
            sorted = true;
            for(int i =1; i<arr.length; i++){
                if(arr[i-1] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    sorted = false;
                }
            }
        }
        return arr;
    }
}
