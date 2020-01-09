package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "I am a string.";
        System.out.println(s);
        String s2 = s.replaceAll("I","You");
        System.out.println(s2);


        String alphanumeric = "abcDeeeF12GhhiiijklabcDeee99z";
        System.out.println(alphanumeric);
        System.out.println(alphanumeric.replaceAll(".","Y"));
        // ^ checks for the beginning of a string.
        System.out.println(alphanumeric.replaceAll("^abcDeee","YYY"));
        System.out.println(alphanumeric.replaceAll("eee99z$","end"));

        // matches have to match the entire regex
        System.out.println(alphanumeric.matches("^Hello"));
        System.out.println("abcde".matches("^abc"));
        System.out.println("abcde".matches("^abcde"));



    }
}
