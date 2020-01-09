package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "I am a string.";
        System.out.println(s);
        String s2 = s.replaceAll("I","You");
        System.out.println(s2);


        String alphanumeric = "abDeeeF12Ghhiiijkl99z";
        System.out.println(alphanumeric);
        System.out.println(alphanumeric.replaceAll(".","Y"));

    }
}
