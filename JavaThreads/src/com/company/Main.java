package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(ThreadColor.ANSI_PURPLE + "Main Thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.start();

//        anotherThread.start();    illegalThreadState

        new Thread() {
            public void run() {
                System.out.println(ThreadColor.ANSI_GREEN + "Anonymous class thread");
            }
        }.start();

        System.out.println(ThreadColor.ANSI_PURPLE+"Mainthread2");


    }
}
