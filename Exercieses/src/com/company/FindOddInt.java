package com.company;

import java.util.*;

public class FindOddInt {

    public static int FindIt(int[] a) {

        HashMap<Integer, Integer> existing = new HashMap<Integer, Integer>();

        for (int i = 0; i < a.length; i++) {
            if(existing.get(a[i]) == null){
                existing.put(a[i], 1);
            } else {
                existing.put(a[i], existing.get(a[i])+1);
            }
        }

        Iterator it = existing.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            if((Math.abs((int)pair.getValue())) %2 == 1){
                return (int) pair.getKey();
            }

        }

        return -1;
    }
}
