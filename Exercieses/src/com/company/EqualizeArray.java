package com.company;

import java.util.HashMap;
import java.util.Map;

public class EqualizeArray {

    public static void main(String[] args) {

//        System.out.println(equalizeArray(new int[]{1,2,2,3}));
        System.out.println(equalizeArray(new int[]{3,3,2,1,3}));

    }

    static int equalizeArray(int[] arr) {

        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();

        int maxKey = -1;
        int maxValue = -1;

        for(int num: arr){

            int amount = numMap.getOrDefault(num,0);
            amount++;
            numMap.put(num, amount);

            if(maxValue == -1){
                maxKey = num;
                maxValue = 1;
            } else if(maxValue < amount){
                maxKey = num;
                maxValue = amount;
            }
        }

        return arr.length - maxValue;

    }
}
