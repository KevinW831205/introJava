package com.company.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> bingoNumbers = Arrays.asList(
                "N40","N36",
                "B6","B12",
                "G15","G34","G23","g64",
                "O71",
                "I26"
        );

//        List<String> gNumbers = new ArrayList<>();
//
//        bingoNumbers.forEach((bingoNumber)->{
//            if(bingoNumber.toUpperCase().startsWith("G")){
//                gNumbers.add(bingoNumber);
////                System.out.println(bingoNumber);
//            }
//        });
//
//        gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
//        gNumbers.forEach((String s)-> System.out.println(s));

        bingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);
    }
}
