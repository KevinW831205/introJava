package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

//        int [] intArr;
//        intArr = new int[10]; // declaring array length

//        int [] intArr2 = new int[10];
//        intArr2[0] = 10;  // Arr in java index start at 0;
//
//        System.out.println(intArr2);
//        System.out.println(intArr2[0]);
//        intArr2 = new int[15];
//        System.out.println(intArr2[0]);
//
//        int[] intArr3 = {1,2,3,4};
//        System.out.println(intArr3[3]);
//
//        int[] intArr4 = new int[10];
//        for(int i =0; i<intArr4.length; i++){
//            intArr4[i] = (i+1)*10;
//        }
//
//        for(int i=0; i<intArr4.length; i++){
//            System.out.println(intArr4[i]);
//        }
//
//        printArray(intArr3);
//        printArray(intArr);

        int[] integers = getIntegers(5);
        printArray(integers);
        System.out.println(getAverage((integers)));

        scanner.close();
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter "+number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array){
        for(int i =0; i<array.length; i++){
            System.out.println("element " +i+ ": "+array[i]);
        }
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i =0; i<array.length; i++){
            sum += array[i];
        }
        return (double) sum/array.length;
    }
}
