package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Countdown countdown = new Countdown();

        CountDownThread cdt1 = new CountDownThread(countdown);
        cdt1.setName("Thread 1");
        CountDownThread cdt2 = new CountDownThread(countdown);
        cdt2.setName("Thread 2");

        cdt1.start();
        cdt2.start();

    }


}
