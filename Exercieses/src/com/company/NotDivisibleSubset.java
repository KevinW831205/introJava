package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


        /*
        19 10 12 10 24 25 22   k=4
        3 2 0 2 0 1 2
         */

        Map<Integer,Integer> remainders = new HashMap<Integer, Integer>();

        for(Integer num : s){
            int remainder = num%k;
            int numberOfRemainder = remainders.getOrDefault(remainder,0);
            numberOfRemainder++;
            remainders.put(remainder,numberOfRemainder);
        }


        int largestNumberOfNonDivisible = 0;
        if(remainders.containsKey(0)){
            largestNumberOfNonDivisible++;
        }
        if(k%2==0 && remainders.containsKey(k/2)){
            largestNumberOfNonDivisible++;
        }
        for(int i=1; i < k/2; i++ ){
            int n1 = remainders.getOrDefault(i, 0);
            int n2 = remainders.getOrDefault(k-i, 0);
            if(n1 > n2){
                largestNumberOfNonDivisible += n1;
            } else {
                largestNumberOfNonDivisible += n2;
            }
        }

        return largestNumberOfNonDivisible;


        /*
        int largestNonDivisible = 0;
        ArrayList<Integer> newList;
        ArrayList<Integer> subset = new ArrayList<Integer>();
        for (int i = 0; i < s.size() - 1; i++) {
            System.out.println("current index: " + i);


            newList = new ArrayList<Integer>(s);
            subset.add(newList.get(i));
            newList.remove(i);


            for (int j = 0; j < newList.size(); j++) {
                ArrayList<Integer> checkList = new ArrayList<Integer>(newList);
                for(int checkListIndex =0; checkListIndex < checkList.size(); checkListIndex++){
                    boolean notDivisible = false;

                    for(int subsetIndex =0; subsetIndex < subset.size(); subsetIndex++){

                        System.out.println(subsetIndex +":" + subset.size());
                        if( (subset.get(subsetIndex) + checkList.get(checkListIndex)) % k == 0){
                            notDivisible = true;
                            break;
                        }
                    }


                    if(!notDivisible){
                        newList = new ArrayList<Integer>(s);
                        subset.add(newList.get(i));
                        newList.remove(i);
                    }


                }
            }

            if (largestNonDivisible < subset.size()) {
                System.out.println("subset size " + subset.size());
                largestNonDivisible = subset.size();
            }
            subset.clear();
        }

        return largestNonDivisible;

         */
    }


}
