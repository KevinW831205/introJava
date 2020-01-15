package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

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

        String regex6 = "^a{3}b{1}c{8}d{3}ef{3}g$";
        System.out.println(p5.matches(regex6));

        String p7 = "abcd.135";
        String regex7 = "^[A-Za-z]+\\.\\d+$";
        System.out.println(p7.matches(regex7));

        String p8 = "abcd.135uvqz.7tzik.999";
        String regex8 = "[A-Za-z]+\\.(\\d+)";
        Pattern pattern8 = Pattern.compile(regex8);
        Matcher matcher8 = pattern8.matcher(p8);
        while (matcher8.find()){
            System.out.println(matcher8.group(1));
        }
    }

}
