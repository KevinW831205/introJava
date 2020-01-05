package com.company.Practice;

public class problem1 {

    //rewrite as a lambda expression
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for(String part:parts){
                System.out.println(part);
            }
        }
    };

    Runnable runnableS = () ->{
        String myString = "Let's split this up into an array";
        String[] parts = myString.split(" ");
        for(String part:parts){
            System.out.println(part);
        }
    };

}
