package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Theatre theatre = new Theatre("th1",8,12);
//        theatre.getSeats();
        if(theatre.reserveSeat("H01")){
            System.out.println("payment");
        } else {
            System.out.println("Already taken");
        }
        if(theatre.reserveSeat("H01")){
            System.out.println("payment");
        } else {
            System.out.println("Already taken");
        }


    }
}
