package com.company;

import java.util.HashMap;
import java.util.Map;

public class MinimumDistance {


    public static void main(String[] args) {

        System.out.println(minimumDistances(new int[]{3,2,1,2,3}));
        System.out.println(minimumDistances(new int[]{7,1,3,4,1,7}));

    }

    static int minimumDistances(int[] a) {

        Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();

        int minDistance = -1;

        for(int i=0; i<a.length; i++){
            if(indexMap.containsKey(a[i])){

            } else {
                indexMap.put(a[i],i);
            }

        }

        return minDistance;
    }

}
