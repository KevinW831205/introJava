package com.company;

import java.util.Scanner;

public class minimumElement {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(int count){
        int[] arr = new int[count];

        for(int i=0; i<count; i++){
            System.out.println("Enter Integer "+(Integer)(i+1) );
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                arr[i] = scanner.nextInt();
            } else {
                System.out.println("Invalid Input");
                break;
            }
        }

        return arr;
    }

    public static int findMin(int[] arr){
        int min = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        return min;
    }

}
