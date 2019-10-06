package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] newIntArr = arrSort.getArr();

        int[] sortedArr = arrSort.mySort(newIntArr);

        printArr(newIntArr);
        printArr(sortedArr);


    }

    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println("index "+i+" : "+arr[i]);
        }
    }
}
