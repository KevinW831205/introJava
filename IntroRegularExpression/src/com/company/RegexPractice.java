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

        System.out.println("problem 9 ------------");
        String p9 = "abcd.135\tuvqz.7\ttzik.999\n";
        String regex9 = "[A-Za-z]+\\.(\\d+)\\s";
        Pattern pattern9 = Pattern.compile(regex9);
        Matcher matcher9 = pattern9.matcher(p9);
        while (matcher9.find()){
            System.out.println(matcher9.group(1));
        }

        String p10 = "abcd.135\tuvqz.7\ttzik.999\n";
        String regex10 = "[A-Za-z]+\\.(\\d+)\\s";
        Pattern pattern10 = Pattern.compile(regex10);
        Matcher matcher10 = pattern10.matcher(p10);
        while (matcher10.find()){
            System.out.println("Start index = "+matcher10.start(1)+" End Index = "+(matcher10.end(1)-1));
        }

//        String p11 = "{0, 2},{0, 5},{1, 3},{2, 4}";
//        String regex11 = "\\{(.+?)\\}";
//        Pattern patter11 = Pattern.compile(regex11);
//        Matcher mather11 = patter11.matcher(p11);
//        while (mather11.find()){
//            System.out.println("Occurrence: "+mather11.group(1));
//        }

        String p11 = "{0, 2},{0, 5},{1, 3},{2, 4},{x, y},{2, 4}";
        String regex11 = "\\{(\\d+, \\d+?)\\}";
        Pattern patter11 = Pattern.compile(regex11);
        Matcher mather11 = patter11.matcher(p11);
        while (mather11.find()){
            System.out.println("Occurrence: "+mather11.group(1));
        }

        String p12a = "11111";
        String p12b = "112111";
        String p12c = "1131";
        String regex12 = "^[0-9]{5}$";
        System.out.println("P12 "+p12a.matches(regex12)+p12b.matches(regex12)+p12c.matches(regex12));

        String p13 = "11111-1111";
        String regex13 = "^\\d{5}\\-\\d{4}$";
        System.out.println("p13 "+p13.matches(regex13));

        String p14a = "11111-1111";
        String p14b = "11111";
        String p14c = "112111";
        String p14d = "11311-3";

        String regex14 = "^\\d{5}(\\-\\d{4})?$";
        System.out.println("p14 "+p14a.matches(regex14)+p14b.matches(regex14)+p14c.matches(regex14)+p14d.matches(regex14));


    }

}
