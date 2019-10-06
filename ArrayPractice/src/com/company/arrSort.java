package com.company;


import java.util.Scanner;

public class arrSort {



    public static int[] getArr(){
        int integersToGet = -1;
        int integersGotten = 0;

        integersToGet = getNumberOfInt();

        while (integersToGet<=0){
            System.out.println("Invalid Input. Enter a positive Integer");
            getNumberOfInt();
        }


        int intArr[] = new int[integersToGet];
//
//        while (integersToGet<integersGotten){
//            System.out.println("Enter number "+integersGotten+1);
//            boolean hasNextInt = scanner.hasNextInt();
//            hasNextInt = scanner.hasNextInt();
//            if(hasNextInt){
//                intArr[integersGotten] = scanner.nextInt();
//            } else {
//                System.out.println("Invalid input, enter an integer");
//            }
//        }

        return intArr;
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

        return arr;
    }
}
