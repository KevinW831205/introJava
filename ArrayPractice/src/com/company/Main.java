package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        int[] newIntArr = arrSort.getArr();
//
//        int[] sortedArr = arrSort.mySort(newIntArr);
//
//        printArr(newIntArr);
//        printArr(sortedArr);

        int[] arr1  =  new int[]{1,2,3,4,5,6,7,8,9,10};
         arr1 =  resizeArray(arr1, 12);
        arr1[10] = 5;
        printArr(arr1);


    }

    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println("index "+i+" : "+arr[i]);
        }
    }

    public static int[] resizeArray(int[] baseData, int size){
        int [] original = baseData;
        baseData = new int[size];
        for(int i =0; i<original.length; i++){
            baseData[i] = original[i];
        }
        return baseData;
    }
}
