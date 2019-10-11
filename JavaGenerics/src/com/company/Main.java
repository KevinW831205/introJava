package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        ArrayList items = new ArrayList();  // doest check for data type to add
//        ArrayList<Integer> items = new ArrayList<>();
//
//        items.add(1);
//        items.add(1);
//        items.add(2);
//        items.add(3);
////        items.add("4");
//
//
//        printDoubled(items);

        FootballPlayer fp1 = new FootballPlayer("fp1");
        BaseballPlayer bsp1 = new BaseballPlayer("bsp1");
        BasketballPlayer bkp1 = new BasketballPlayer("bkp1");

        Team t1 = new Team("t1");
        t1.addPlayer(fp1);
        t1.addPlayer(bsp1);
        t1.addPlayer(bkp1);


    }

    // before applying generics
//    private static void printDoubled(ArrayList n){
//        for(Object i : n){
//            System.out.println((Integer) i * 2);
//        }
//    }

    private static void printDoubled(ArrayList<Integer> n ){
        for(int i : n){
            System.out.println(i*2);
        }
    }

}
