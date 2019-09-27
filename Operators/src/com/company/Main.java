package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//
//        int adding = 1+2;
//        int mixed = (1+2)%3;
//
//        int testing = adding;
//        testing -= 1;
//
//        System.out.println("testing " + testing);
//        System.out.println("adding " + adding);
//
//        System.out.println(mixed);
//
//
//        boolean isWorking = false;
//
////        if(!isWorking)
////            System.out.println("one line");
//
//        if(!isWorking) {
//            System.out.println("yes");
//            System.out.println("twolines?");
//        } else {
//            System.out.println("no");
//        }
//
//        //ternary
//        isWorking = false;
//
//        boolean wasWorking = isWorking ? true : false;
//
//        if(wasWorking){
//            System.out.println("was working true");
//        }



        double var1 = 20.00d;
        double var2 = 80.00d;

        double hundredSum = (var1 + var2) *100d;

        double remainder = hundredSum % 40.00d;
        boolean noRemainder = (remainder == 0) ? true : false;

        System.out.println("noRemainder true false? " + noRemainder);
        if(!noRemainder){
            System.out.println("got remainder");
        }
    }
}
