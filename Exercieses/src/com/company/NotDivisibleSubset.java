package com.company;

import java.util.ArrayList;
import java.util.List;

public class NotDivisibleSubset {

    public static void main(String[] args) {

        List<Integer> input1 = new ArrayList<>();
        input1.add(1);
        input1.add(7);
        input1.add(2);
        input1.add(4);

        List<Integer> input2 = new ArrayList<>();
        input2.add(19);
        input2.add(10);
        input2.add(12);
        input2.add(10);
        input2.add(24);
        input2.add(25);
        input2.add(22);



        System.out.println( nonDivisibleSubset(3,input1));
        System.out.println(nonDivisibleSubset(4, input2));
    }

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here

        int largestNonDivisible = 0;
        for(int i =0; i<s.size(); i++){
            int nonDivisibles = 1;
            System.out.println("current index: "+i);
            for(int j=0; j<s.size(); j++){
                if(i != j){
                    int sum = s.get(i) + s.get(j);
                    if(sum%k != 0) {
                        System.out.println(s.get(i)+","+s.get(j));
                        nonDivisibles++;
                    }
                }
            }
            if(largestNonDivisible < nonDivisibles){
                largestNonDivisible = nonDivisibles;
            }
        }

        return largestNonDivisible;
    }


}
