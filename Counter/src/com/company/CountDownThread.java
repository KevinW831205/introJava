package com.company;

public class CountDownThread extends Thread {
    private Countdown threadCountdown;

    public CountDownThread(Countdown countdown){
        threadCountdown = countdown;
    }

    public void run(){
        threadCountdown.doCountDown();
    }
}
