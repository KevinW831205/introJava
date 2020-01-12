package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "I am a string.";
        System.out.println(s);
        String s2 = s.replaceAll("I","You");
        System.out.println(s2);


        String alphanumeric = "abcDeeeF1245GhhiiijklabcDeee99z";
        System.out.println(alphanumeric);
        System.out.println(alphanumeric.replaceAll(".","Y"));
        // ^ checks for the beginning of a string.
        System.out.println(alphanumeric.replaceAll("^abcDeee","YYY"));
        System.out.println(alphanumeric.replaceAll("eee99z$","end"));

        // matches have to match the entire regex
        System.out.println(alphanumeric.matches("^Hello"));
        System.out.println("abcde".matches("^abc"));
        System.out.println("abcde".matches("^abcde"));

        // selecting all characters between []
        System.out.println(alphanumeric.replaceAll("[aei]","!"));

        //replace aei if followed by F or j
        System.out.println(alphanumeric.replaceAll("[aei][Fj]","!"));

        //instance of [h or H]followed by arry
        System.out.println("name is harry".replaceAll("[Hh]arry","Harry"));

        //not e or j
        System.out.println(alphanumeric.replaceAll("[^ej]","!"));

        //replacing multiple short hand form
        System.out.println(alphanumeric.replaceAll("[abcdef345678]","!"));
        System.out.println(alphanumeric.replaceAll("[a-f3-8]","!"));
        System.out.println(alphanumeric.replaceAll("[a-fA-f3-8]","!"));

        //(?i)ignores case
        System.out.println(alphanumeric.replaceAll("(?i)[a-f3-8]","!"));

        //replace all numbers
        System.out.println(alphanumeric.replaceAll("[0-9]","!"));
        System.out.println(alphanumeric.replaceAll("\\d","!"));

        //replace all non-digits
        System.out.println(alphanumeric.replaceAll("\\D","!"));

        //replace all white space
        String whiteSpace = "a   df 3ds tdgs eerer d   g";
        System.out.println(whiteSpace.replaceAll("\\s",""));


    }
}
