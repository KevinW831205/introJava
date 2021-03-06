package com.company;

public class AnotherThread extends Thread {

    @Override
    public void run() {

        System.out.println( ThreadColor.ANSI_BLUE + "Thread from "+ currentThread().getName());

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println(ThreadColor.ANSI_BLUE + "Another Thread woke me up");
            return;
        }
        System.out.println(ThreadColor.ANSI_BLUE+" 3 seconds passed, I am awake");
    }
}
