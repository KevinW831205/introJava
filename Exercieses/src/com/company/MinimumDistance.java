package com.company;

import java.util.HashMap;
import java.util.Map;

public class MinimumDistance {


    public static void main(String[] args) {

        System.out.println(minimumDistances(new int[]{3, 2, 1, 2, 3}) + "expects 2");
        System.out.println(minimumDistances(new int[]{7, 1, 3, 4, 1, 7}) + "expects 3");

    }

    static int minimumDistances(int[] a) {

        Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();

        int minDistance = -1;

        for (int i = 0; i < a.length; i++) {
            if (indexMap.containsKey(a[i])) {
                int index1 = indexMap.get(a[i]);
                int distance = i - index1;

                if (minDistance == -1) {
                    minDistance = distance;
                } else if (distance<minDistance){
                    minDistance = distance;
                }

                indexMap.replace(a[i], i);

            } else {
                indexMap.put(a[i], i);
            }

        }

        return minDistance;
    }

}
