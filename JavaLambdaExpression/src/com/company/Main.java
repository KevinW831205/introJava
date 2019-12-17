package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        new Thread(new CodeToRun()).start();
//
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Printing from runnable2");
//            }
//        }).start();
//
//        new Thread(() -> System.out.println("Printing with Lambda Expression")).start();

        new Thread(()->{
            System.out.println("print1");
            System.out.println("print2");
            int x =5;
            x += 2;
            System.out.println("x"+x);
        }).start();

    }
}


class CodeToRun implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing from runnable");
    }
}