package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {
    public static void main(String[] args) {
        String p1 = "I want a bike.";
        System.out.println(p1.matches("I want a bike."));

        String p2 = "I want a ball.";
        String regex2 = "I want a \\w+.";
        System.out.println(p1.matches(regex2));
        System.out.println(p2.matches(regex2));

        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(p2);
        System.out.println(matcher.matches());

        matcher = pattern.matcher(p1);
        System.out.println(matcher.matches());

        String p4 = "Replace all blanks with underscores.";
        System.out.println(p4.replaceAll("\\s","_"));

        String p5 = "aaabccccccccdddefffg";
        String regex5 = "[a-g]+";
        System.out.println(p5.matches(regex5));

    }

}
