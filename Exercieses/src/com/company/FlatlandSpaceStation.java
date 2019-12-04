package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatlandSpaceStation {

    public static void main(String[] args) {

        System.out.println(flatlandSpaceStations(6, new int[]{0,1,2,4,3,5}) + " expect 0");

        System.out.println(flatlandSpaceStations(5, new int[]{0, 4}) + " expect 2");
        System.out.println(flatlandSpaceStations(11, new int[]{0, 4}) + " expect 7");

    }

    static int flatlandSpaceStations(int n, int[] c) {
        Arrays.sort(c);
        int longestDistance = Math.max(c[0], n - c[c.length-1] - 1);
        for (int i = 0; i < c.length - 1; i++) {
            int distanceBetween = c[i+1] - c[i];
            int maxDistanceBetween = distanceBetween/2;
            if(maxDistanceBetween > longestDistance){
                longestDistance = maxDistanceBetween;
            }
        }
        return longestDistance;
    }

}
