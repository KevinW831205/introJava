package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] newIntArr = arrSort.getArr();

        int[] sortedArr = arrSort.mySort(newIntArr);

        for (int i = 0; i < sortedArr.length; i++) {
            System.out.println(sortedArr[i]);
        }


    }
}
