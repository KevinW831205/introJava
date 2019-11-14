package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CutSticks {
    public static void main(String[] args) {

        int[] x = cutTheSticks(new int[]{1,2,3});


    }

    static int[] cutTheSticks(int[] arr) {

        boolean sticksLeft = true;
        ArrayList<Integer> numCuts = new ArrayList<Integer>();

        while (sticksLeft) {
            int min = Integer.MAX_VALUE;
            sticksLeft = false;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] < min && arr[i]>0){
                    min = arr[i];
                    sticksLeft = true;
                }
            }
            if(!sticksLeft){
                break;
            }

            int cuts = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i] > 0){
                    arr[i] -= min;
                    cuts++;
                }
            }
            numCuts.add(cuts);
        }

        int[] result = new int[numCuts.size()];
        for(int i=0 ; i<numCuts.size(); i++){
            result[i] = (int) numCuts.get(i);
        }

        return result;
    }

}
