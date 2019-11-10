package com.company;

import java.util.HashMap;
import java.util.Map;

public class Line {
    public static void main(String[] args) {

        int[] c1 = {25, 25, 50};

        System.out.println(tickets(c1));
        System.out.println(tickets(new int[]{25,100}));
        System.out.println(tickets(new int[]{25,25,50,50,100}));
        System.out.println(tickets(new int[]{25,50,25,100}));
        System.out.println(tickets(new int[]{25,25,25,100}));

    }

    public static String tickets(int[] peopleInLine) {

        int[] bills = {0, 0};
        for(int customerBill: peopleInLine){
            System.out.println(customerBill);
        }

        for (int customerBill : peopleInLine) {
            switch (customerBill) {
                case 25:
                    bills[0]++;
                    break;
                case 50:
                    bills[0]--;
                    bills[1]++;
                    if (bills[0] < 0) {
                        return "NO";
                    }
                    break;
                case 100:
                    if(bills[1]>0 && bills[0]>0){
                        bills[0]--;
                        bills[1]--;
                    } else if(bills[0] >=3){
                        bills[0] -=3;
                    } else {
                        return "NO";
                    }
                    break;
                default:
                    return "error";
            }
        }
        return "YES";
    }

}
