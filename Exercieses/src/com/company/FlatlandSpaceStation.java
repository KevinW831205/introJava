package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatlandSpaceStation {

    public static void main(String[] args) {

        System.out.println(flatlandSpaceStations(5, new int[]{0, 4}) + " expect 2");


    }

    static int flatlandSpaceStations(int n, int[] c) {
        Arrays.sort(c);
        int longestDistance = c[0];
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
