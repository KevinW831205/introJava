package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Theatre theatre = new Theatre("th1", 8, 12);
        theatre.getSeats();
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

        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);


        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());

        priceSeats.add(theatre.new Seat("B00",13));
        priceSeats.add(theatre.new Seat("A00",13));

        Collections.sort(priceSeats, Theatre.PRICE_ORDER );   // doesn't swap for seatNumber order
        System.out.println("Sort in price order");
        printList(priceSeats);

    }


        /*
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats); // shallow copy shared object in memory but separate list
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if(theatre.reserveSeat("A02")){
            System.out.println("Success");
        } else {
            System.out.println("Already reserved");
        }
        Collections.shuffle(seatCopy);
        System.out.println("Printing seat coy");
        printList(seatCopy);
        System.out.println("Printing theatre.seats");
        printList(theatre.seats);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);

        System.out.println("min "+minSeat.getSeatNumber());
        System.out.println("max "+maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Sorted seatcopy ");
        printList(seatCopy);
        }
         */


    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat:list){
            System.out.print(" "+seat.getSeatNumber() + " "+ seat.getPrice());
        }
        System.out.println();
        System.out.println("===================");

    }

/*

    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat:list){
            System.out.print(" "+seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("===================");
    }

    public static void sortList(List<? extends Theatre.Seat> list){
        for(int i =0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i).compareTo(list.get(j))>0){
                    Collections.swap(list,i,j);
                }
            }
        }
    }

 */

}
