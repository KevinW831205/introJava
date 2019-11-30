package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(ThreadColor.ANSI_PURPLE + "Main Thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("Name: AnotherThread");
        anotherThread.start();
//        anotherThread.run();  // run from main thread

//        anotherThread.start();    illegalThreadState

        new Thread() {
            public void run() {
                System.out.println(ThreadColor.ANSI_GREEN + "Anonymous class thread");
            }
        }.start();



        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ThreadColor.ANSI_RED+"Anonymous implementation of run");;
            }
        });

        myRunnableThread.start();
        System.out.println(ThreadColor.ANSI_PURPLE+"Mainthread2");


    }
}
