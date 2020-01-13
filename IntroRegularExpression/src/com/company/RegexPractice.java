package com.company;

public class RegexPractice {
    public static void main(String[] args) {
        String p1 = "I want a bike.";
        System.out.println(p1.matches("I want a bike."));

        String p2 = "I want a ball.";
        String regex2 = "I want a \\w+.";
        System.out.println(p1.matches(regex2));
        System.out.println(p2.matches(regex2));
    }

}
